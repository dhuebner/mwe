/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowLogValidator.java,v 1.1 2009/04/10 05:36:57 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType;

/**
 * A sample validator interface for {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkflowLogValidator
{
	boolean validate();

	boolean validateEntries(FeatureMap value);
	boolean validateErrors(EList<WorkflowLogEntry> value);
	boolean validateWarnings(EList<WorkflowLogEntry> value);
	boolean validateInfos(EList<WorkflowLogEntry> value);
	boolean validateDebugs(EList<WorkflowLogEntry> value);

	boolean validateLogLevel(WorkflowLogEntryType value);
}