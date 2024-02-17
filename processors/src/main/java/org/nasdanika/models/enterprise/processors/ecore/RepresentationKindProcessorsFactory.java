/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.REPRESENTATION_KIND)
public class RepresentationKindProcessorsFactory {
	
	private Context context;

	public RepresentationKindProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<RepresentationProcessorsFactory> getGoverns();
//	EList<RepresentationElementKindProcessorsFactory> getElements();
//	EList<SemanticDomainKindProcessorsFactory> getDomains();

} // RepresentationKind
