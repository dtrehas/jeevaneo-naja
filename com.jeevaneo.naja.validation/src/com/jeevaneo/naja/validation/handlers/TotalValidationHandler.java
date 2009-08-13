package com.jeevaneo.naja.validation.handlers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

import com.jeevaneo.naja.validation.Activator;
import com.jeevaneo.naja.validation.ClientSelector;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class TotalValidationHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public TotalValidationHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new ValidatorJob().schedule();
		return null;
	}

}

class ValidatorJob extends Job {

	public ValidatorJob() {
		super("Naja Total Validation");
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		monitor.beginTask("Total validation", 1000);
		monitor.subTask("Detecting files");
		final ResourceSet resourceSet = new ResourceSetImpl();
		final List<EObject> all = new ArrayList<EObject>();
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot()
				.getProjects()) {
			if (project.isOpen()) {
				try {
					project.accept(new IResourceVisitor() {

						@Override
						public boolean visit(IResource resource)
								throws CoreException {
							if (!(resource instanceof IFile)) {
								return true;
							}
							IFile file = (IFile) resource;
							if (file.getName().equals(".project")) {
								return false;
							}
//							uri=uri.replaceAll("file:/D:/workspaces/runtime-naja-iii.product", "");
							URIConverter uriConverter = resourceSet.getURIConverter();
							org.eclipse.emf.common.util.URI uri=uriConverter.normalize(org.eclipse.emf.common.util.URI
									.createURI(""
											+ file.getFullPath()));
							System.err.println(uri);
							monitor.subTask(uri.toString());
							if(monitor.isCanceled())
							{
								return false;
							}
							for(Resource res2 : resourceSet.getResources())
							{
								
								System.err.println(uri + " vs " + uriConverter.normalize(res2.getURI()));
							}
							
							Resource res = resourceSet.getResource(
									org.eclipse.emf.common.util.URI
											.createURI(""
													+ uri),
									true);
							all.addAll(res.getContents());
							return true;
						}
					});
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		monitor.worked(150);
		monitor.subTask("resolving proxies");
//		EcoreUtil.resolveAll(resourceSet);

//		Notifier notifier = null;
//		int count = 0;
//		for(TreeIterator<Notifier> ntit=resourceSet.getAllContents();ntit.hasNext();notifier = ntit.next())
//		{
//			System.out.println(notifier);
//			count++;
//			EObject son=null;
//			int count2=0;
//			if(null!=notifier)
//			if(notifier instanceof EObject)
//			{
//				 for(TreeIterator<EObject> tit=((EObject)notifier).
//						eAllContents();tit.
//						hasNext();son = tit.
//						next())
//				{
////					System.out.println("Found " + son);
//					count2++;
//				}
//			}
//			else
//			{
//				Resource resnot = (Resource) notifier;
//				System.err.println("GNA " + notifier + " " + resnot.getContents());
////				EObject eo2 = null;
////				for(TreeIterator<EObject> rtit=resnot.getAllContents();rtit.hasNext();eo2 = rtit.next())
//				for(EObject eo2:resnot.getContents())
//				{
//					
//					System.out.println("Found² " + eo2);
//					TreeIterator<EObject> treeIterator = eo2.eAllContents();
//					while(treeIterator.hasNext())
//					{
//						System.out.println("Found3 " + treeIterator.next());
//					}
//					count2++;
//				}
//				
//			}
//			System.out.println("" + count + " vs " + count2);
//		}
//		
////		EObject son=null;
////		for(TreeIterator<EObject> tit=eo.eAllContents();tit.hasNext();son = tit.next())
////		{
////			System.out.println("Found " + son);
////		}
		monitor.worked(50);
		if(monitor.isCanceled())
		{
			return Status.CANCEL_STATUS;
		}

		int increment = 800 / (all.size() + 1);
		if (increment == 0)
			increment = 1;
		ClientSelector.running = true;
		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		validator.setReportSuccesses(true);
		for (EObject eo : all) {
			monitor.subTask("" + eo);
			if(monitor.isCanceled())
			{
				return Status.CANCEL_STATUS;
			}			
			
			IStatus status = validator.validate(eo);
			try {
				MarkerUtil.createMarkers(status);
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
			}
			monitor.worked(increment);
		}
		ClientSelector.running = false;

		monitor.done();

		return Status.OK_STATUS;
	}

}
