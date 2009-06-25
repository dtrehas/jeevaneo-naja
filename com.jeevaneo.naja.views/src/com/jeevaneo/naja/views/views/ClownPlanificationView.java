package com.jeevaneo.naja.views.views;

import java.text.DateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.impl.Utils;
import com.jeevaneo.naja.presentation.NajaEditor;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class ClownPlanificationView extends ViewPart {
	public class SelectInEditorAction extends Action {
		public void run() {
			selectInEditor();
		}

		private void selectInEditor() {
			ISelection selection = viewer.getSelection();
			Object obj = ((IStructuredSelection) selection).getFirstElement();

			IEditorPart editor = getSite().getWorkbenchWindow().getActivePage()
					.getActiveEditor();
			if (null != editor && editor instanceof NajaEditor) {
				((NajaEditor) editor).setSelectionToViewer(Collections
						.singleton(obj));
			}
		}
	}

	private TableViewer viewer;
	private Action action1;
	private Action doubleClickAction;

	// the listener we register with the selection service
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart,
				ISelection selection) {
			// we ignore our own selections
			if (sourcepart != ClownPlanificationView.this) {
				if (selection instanceof StructuredSelection
						&& !selection.isEmpty()) {
					StructuredSelection sselection = (StructuredSelection) selection;
					if (sselection.size() > 1) {
						cleanDisplay();
					} else {
						Object selected = sselection.getFirstElement();
						if (selected instanceof Person) {
							Person person = (Person) selected;
							display(person.getName(), person
									.getPlanifications());
						} else if (selected instanceof Task) {
							Task task = (Task) selected;
							display(task.getName(), task.getPlanifications());
						} else if (selected instanceof Category) {
							Category category = (Category) selected;
							Collection<Task> subtasks = Utils
									.recursiveFindTasks(category);
							Set<Planification> planifs = new HashSet<Planification>();
							for (Task task : subtasks) {
								planifs.addAll(task.getPlanifications());
							}
							display(category.getName(), planifs);
						} else {
							cleanDisplay();
						}
					}

				}
			}
		}
	};
	private ViewerFilter positiveUnimputedPlanifications = new ViewerFilter() {

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			if (null != element && element instanceof Planification) {
				Planification planif = (Planification) element;
				return planif.getUnimputedLoad() > 0;
			}
			return false;
		}
	};

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		// private Person person = null;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			// if (newInput instanceof Person) {
			// person = (Person) newInput;
			// } else {
			// person = null;
			// }
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			System.out.println("parent=" + parent);
			if (null == parent || !(parent.getClass().isArray())) {
				return new Object[] {};
			}
			return (Object[]) parent;
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		private DateFormat df = DateFormat.getDateInstance();

		public String getColumnText(Object obj, int index) {
			if (null == obj || !(obj instanceof Planification))
				return "";
			Planification planification = (Planification) obj;
			switch (index) {
			case 0:
				return planification.getTask() == null ? "Nothing!?" : ""
						+ planification.getTask().getName();
			case 1:
				return planification.getResource() == null ? "Nobody!?" : ""
						+ planification.getResource().getName();
			case 2:
				return "" + planification.getLoad() + "h";
			case 3:
				return "" + planification.getImputedLoad() + "h";
			case 4:
				return "" + planification.getUnimputedLoad() + "h";
			case 5:
				return df.format(planification.getFirstDate());
			case 6:
				return df.format(planification.getLastDate());
			case 7:
				return "" + planification.getMaxLoadPerDay() + "h/day";
			case 8:
				return planification.getComment();
			}
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return index == 0 ? getImage(obj) : null;
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	class FirstDateSorter extends ViewerSorter {

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (e1 instanceof Planification && e2 instanceof Planification) {
				Planification p1 = (Planification) e1;
				Planification p2 = (Planification) e2;

				Date d1 = p1.getFirstDate();
				Date d2 = p2.getFirstDate();

				if (null != d1 && null != d2) {
					int ret = d1.compareTo(d2);
					return ret;
				} else if (null == d1) {
					return 1;
				} else {
					return -1;
				}
			}
			return super.compare(viewer, e1, e2);
		}
	}

	/**
	 * The constructor.
	 */
	public ClownPlanificationView() {
	}

	protected void display(String name, Collection<Planification> selected) {
		if (null != selected) {
			setPartName(name + "'s left planifications");
		}
		if (null == selected) {
			viewer.setInput(null);
		} else {
			viewer.setInput(selected.toArray());
		}
		// viewer.refresh();
	}

	protected void cleanDisplay() {
		display("Invisible man", null);
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new FirstDateSorter());
		viewer.setInput(getViewSite());
		viewer
				.setFilters(new ViewerFilter[] { positiveUnimputedPlanifications });

		TableColumn column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(350);
		column.setText("Task");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(150);
		column.setText("Resource");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(50);
		column.setText("Load");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(50);
		column.setText("Imputed");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(50);
		column.setText("Unimputed");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(85);
		column.setText("First date");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(85);
		column.setText("Last date");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(60);
		column.setText("Max per day");

		column = new TableColumn(viewer.getTable(), SWT.NONE);
		column.setWidth(300);
		column.setText("Comment");

		viewer.getTable().setLinesVisible(true);
		viewer.getTable().setHeaderVisible(true);

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(listener);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ClownPlanificationView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
	}

	private void makeActions() {
		action1 = new SelectInEditorAction();
		action1.setText("Go to");
		action1.setToolTipText("Select in editor");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		doubleClickAction = new SelectInEditorAction();
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is
		// disposed
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(listener);
		super.dispose();
	}
}