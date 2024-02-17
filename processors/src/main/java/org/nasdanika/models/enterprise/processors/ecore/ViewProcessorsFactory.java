/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.VIEW)
public class ViewProcessorsFactory {
	
	protected Context context;

	public ViewProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<RepresentationProcessorsFactory> getRepresentations();

} // View
