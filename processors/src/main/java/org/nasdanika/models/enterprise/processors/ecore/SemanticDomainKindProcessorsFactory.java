/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_DOMAIN_KIND)
public class SemanticDomainKindProcessorsFactory {
	
	private Context context;

	public SemanticDomainKindProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticDomainProcessorsFactory> getGoverns();
//	EList<SemanticElementKindProcessorsFactory> getElements();

} // SemanticDomainKind
