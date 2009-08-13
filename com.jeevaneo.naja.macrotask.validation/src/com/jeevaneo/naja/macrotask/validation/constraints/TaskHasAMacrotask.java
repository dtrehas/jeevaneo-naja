package com.jeevaneo.naja.macrotask.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.macrotasks.Macrotask;

public class TaskHasAMacrotask extends AbstractModelConstraint {

	public TaskHasAMacrotask() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target instanceof Task) {
			Task task = (Task) target;
			// TODO find the corresponding Macrotask
			if (!hasAMacroTask(task)) {
				return ctx.createFailureStatus(task.getLabel());
			}
		}
		return ctx.createSuccessStatus();
	}

	private boolean hasAMacroTask(Task task) {
		EObject eo = (EObject) task;
		TreeIterator<Notifier> allContents = eo.eResource().getResourceSet()
				.getAllContents();
		boolean foundAMacrotask = false;
		while (allContents.hasNext()) {
			Notifier notifier = allContents.next();
			// System.out.println(notifier);
			if (notifier instanceof Macrotask) {
				foundAMacrotask = true;
				Macrotask macrotask = (Macrotask) notifier;
				for (Task task2 : macrotask.getTasks()) {
					if (task.equals(task2)) {
						// System.out.println("Task " + task.getName() +
						// " has a macrotask " + macrotask.getId());
						return true;
					}
				}
			}
		}
		if (!foundAMacrotask) {
			// MessageDialog.openWarning(
			// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
			// "Macrotasks",
			// "No macrotask found in the resource set!");
		}
		return false;
	}

}
