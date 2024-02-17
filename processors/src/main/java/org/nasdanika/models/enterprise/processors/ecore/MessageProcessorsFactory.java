/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.MESSAGE)
public class MessageProcessorsFactory extends ViewProcessorsFactory {
	
	public MessageProcessorsFactory(Context context) {
		super(context);
	}
	
//	EList<ChannelProcessorsFactory> getDeliveredBy();

} // Message
