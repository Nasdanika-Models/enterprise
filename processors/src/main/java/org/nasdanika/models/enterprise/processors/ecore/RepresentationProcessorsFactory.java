/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.REPRESENTATION)
public class RepresentationProcessorsFactory {
	
	private Context context;

	public RepresentationProcessorsFactory(Context context) {
		this.context = context;
	}

//	EList<RepresentationElementProcessorsFactory> getElements();

} // Representation
