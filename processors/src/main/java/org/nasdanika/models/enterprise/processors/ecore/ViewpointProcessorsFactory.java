/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.VIEWPOINT)
public class ViewpointProcessorsFactory {
	
	private Context context;

	public ViewpointProcessorsFactory(Context context) {
		this.context = context;
	}
	

//	EList<ConcernProcessorsFactory> getFrames();
//	EList<ViewProcessorsFactory> getGoverns();
//	EList<SemanticDomainKindProcessorsFactory> getDomains();
//	EList<RepresentationKindProcessorsFactory> getRepresentations();

} // Viewpoint
