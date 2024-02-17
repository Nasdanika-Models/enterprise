/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.CHANNEL)
public class ChannelProcessorsFactory {	
	
	private Context context;

	public ChannelProcessorsFactory(Context context) {
		this.context = context;
	}
	
} 
