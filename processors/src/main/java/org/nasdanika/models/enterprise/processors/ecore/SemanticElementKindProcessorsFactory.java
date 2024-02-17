/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_ELEMENT_KIND)
public class SemanticElementKindProcessorsFactory {
	
	private Context context;

	public SemanticElementKindProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticElementProcessorsFactory> getGoverns();

} // SemanticElementKind
