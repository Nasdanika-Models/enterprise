/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION)
public class SemanticDomainDescriptionProcessorsFactory {
	
	private Context context;

	public SemanticDomainDescriptionProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<SemanticDomainProcessorsFactory> getDescribes();
//	EList<ViewProcessorsFactory> getViews();

} // SemanticDomainDescription
