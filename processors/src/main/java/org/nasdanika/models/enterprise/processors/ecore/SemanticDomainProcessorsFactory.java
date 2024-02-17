/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_DOMAIN)
public class SemanticDomainProcessorsFactory {
	
	private Context context;

	public SemanticDomainProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticElementProcessorsFactory> getElements();

} // SemanticDomain
