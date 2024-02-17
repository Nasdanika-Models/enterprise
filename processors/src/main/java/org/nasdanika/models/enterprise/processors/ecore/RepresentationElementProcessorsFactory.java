/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.REPRESENTATION_ELEMENT)
public class RepresentationElementProcessorsFactory {
	
	private Context context;

	public RepresentationElementProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticElementProcessorsFactory> getRepresents();

} // RepresentationElement
