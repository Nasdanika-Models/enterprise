/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EReferenceNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.MESSAGE)
public class MessageProcessorsFactory extends ViewProcessorsFactory {
	
	public MessageProcessorsFactory(Context context) {
		super(context);
	}

	@EClassifierNodeProcessorFactory(
			description = "A type of view which is delivered via a channel",
			documentation = 
                    """
					A message is a type of [view](../view/index.html) which is delivered to [stakeholders](../stakeholder/index.html) via 
					a [channel](../channel/index.html).
					
					It might be argued that any view is delivered via some kind of channel and therefore is a message.
					This argument may be clarified in two ways:
					
					* View is an abstract class focusing on addressing stakeholders concerns regardless of the channel. Message is a concrete class.
					* There is some "default" channel delivering the [semantic domain description](../SemanticDomainDescription/index.html). 
					Views are delivered via the default channels and are not considered messages because they don't have a sender recipient.
					Any views exchanged between stakeholders via a non-default channel are messages.
					
					## Example
					
					A class diagram ([representation](../representation/index.html)) and a table with class names and short descriptions (also a representation)
					constitute a view into a package. 
					This view can be delivered to stakeholders as a:
					
					* Web page (default channel) 
					* E-mail with HTML content
					* E-mail with a PDF attachment 					
                    """
	)
	public EClassNodeProcessor createMessageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = EnterprisePackage.eNS_URI,
			classID = EnterprisePackage.MESSAGE,
			featureID = EnterprisePackage.MESSAGE__DELIVERED_BY,
			label = "Delivered by",
			description = "A message can be delivered over one or more channels"
	)
	public EReferenceNodeProcessor createDeliveredByProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}

} // Message
