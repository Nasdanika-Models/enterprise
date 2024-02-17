/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.REPRESENTATION_ELEMENT_KIND)
public class RepresentationElementKindProcessorsFactory {
	
	private Context context;

	public RepresentationElementKindProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticElementKindProcessorsFactory> getRepresents();

} // RepresentationElementKind
