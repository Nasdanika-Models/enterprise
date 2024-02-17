/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_ELEMENT)
public class SemanticElementProcessorsFactory {
	
	private Context context;

	public SemanticElementProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<RepresentationElementProcessorsFactory> getRepresentedBy();

} // SemanticElement
