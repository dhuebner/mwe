/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class XMLPartitionScanner extends RuleBasedPartitionScanner {
    public final static String XML_DEFAULT = "__xml_default";

    public final static String XML_COMMENT = "__xml_comment";

    public final static String XML_TAG = "__xml_tag";

    public XMLPartitionScanner() {

        final IToken xmlComment = new Token(XML_COMMENT);
        final IToken tag = new Token(XML_TAG);

        final IPredicateRule[] rules = new IPredicateRule[2];

        rules[0] = new MultiLineRule("<!--", "-->", xmlComment);
        rules[1] = new TagRule(tag);

        setPredicateRules(rules);
    }
}
