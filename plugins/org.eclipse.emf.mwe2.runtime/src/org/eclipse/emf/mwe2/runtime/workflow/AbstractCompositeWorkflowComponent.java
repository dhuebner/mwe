/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractCompositeWorkflowComponent implements
		IWorkflowComponent {
	private List<IWorkflowComponent> children = new ArrayList<IWorkflowComponent>();
	
	protected List<IWorkflowComponent> getChildren() {
		return children;
	}
	
	public void addComponent(IWorkflowComponent component) {
		this.children.add(component);
	}

	public void preInvoke() {
		for (IWorkflowComponent component : getChildren()) {
			component.preInvoke();
		}
	}

	public void invoke(IWorkflowContext ctx) {
		for (IWorkflowComponent component : getChildren()) {
			component.invoke(ctx);
		}
	}

	public void postInvoke() {
		for (IWorkflowComponent component : getChildren()) {
			component.postInvoke();
		}
	}

}
