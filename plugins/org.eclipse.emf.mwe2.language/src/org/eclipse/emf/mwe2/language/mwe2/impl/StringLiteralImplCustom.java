package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.xtext.common.types.JvmType;
import static org.eclipse.emf.mwe2.language.mwe2.impl.JvmTypeUriFactory.*;

public class StringLiteralImplCustom extends StringLiteralImpl {

	@Override
	public JvmType getActualType() {
		return findJvmType(getURIForFqn(String.class.getName()),this);
	}
}