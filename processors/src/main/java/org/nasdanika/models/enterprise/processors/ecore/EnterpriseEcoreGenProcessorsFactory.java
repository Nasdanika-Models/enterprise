package org.nasdanika.models.enterprise.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EPackageNodeProcessorFactory(nsURI = EnterprisePackage.eNS_URI)
public class EnterpriseEcoreGenProcessorsFactory {

	private Context context;
	
	@Factory
	public final ChannelProcessorsFactory channelProcessorsFactory;
	
	@Factory
	public final ConcernProcessorsFactory concernProcessorsFactory;
	
	@Factory
	public final EnterpriseProcessorsFactory enterpriseProcessorsFactory;
	
	@Factory
	public final MessageProcessorsFactory messageProcessorsFactory;
	
	@Factory
	public final RepresentationProcessorsFactory representationProcessorsFactory;
	
	@Factory
	public final RepresentationElementProcessorsFactory representationElementProcessorsFactory;
	
	@Factory
	public final RepresentationElementKindProcessorsFactory representationElementKindProcessorsFactory;
	
	@Factory
	public final RepresentationKindProcessorsFactory representationKindProcessorsFactory;
	
	@Factory
	public final SemanticDomainProcessorsFactory semanticDomainProcessorsFactory;
	
	@Factory
	public final SemanticDomainDescriptionProcessorsFactory semanticDomainDescriptionProcessorsFactory;
	
	@Factory
	public final SemanticDomainKindProcessorsFactory semanticDomainKindProcessorsFactory;
	
	@Factory
	public final SemanticElementProcessorsFactory semanticElementProcessorsFactory;
	
	@Factory
	public final SemanticElementKindProcessorsFactory semanicElementKindProcessorsFactory;
	
	@Factory
	public final StakeholderProcessorsFactory stakeholderProcessorsFactory;
	
	@Factory
	public final ViewProcessorsFactory viewProcessorsFactory;
	
	@Factory
	public final ViewpointProcessorsFactory viewpointProcessorsFactory;		
	
	public EnterpriseEcoreGenProcessorsFactory(Context context) {
		this.context = context;
		channelProcessorsFactory = new ChannelProcessorsFactory(context);
		concernProcessorsFactory = new ConcernProcessorsFactory(context);
		enterpriseProcessorsFactory = new EnterpriseProcessorsFactory(context);
		messageProcessorsFactory = new MessageProcessorsFactory(context);
		representationProcessorsFactory = new RepresentationProcessorsFactory(context);
		representationElementProcessorsFactory = new RepresentationElementProcessorsFactory(context);
		representationElementKindProcessorsFactory = new RepresentationElementKindProcessorsFactory(context);
		representationKindProcessorsFactory = new RepresentationKindProcessorsFactory(context);
		semanticDomainProcessorsFactory = new SemanticDomainProcessorsFactory(context);
		semanticDomainDescriptionProcessorsFactory = new SemanticDomainDescriptionProcessorsFactory(context);
		semanticDomainKindProcessorsFactory = new SemanticDomainKindProcessorsFactory(context);
		semanticElementProcessorsFactory = new SemanticElementProcessorsFactory(context);
		semanicElementKindProcessorsFactory = new SemanticElementKindProcessorsFactory(context);
		stakeholderProcessorsFactory = new StakeholderProcessorsFactory(context);
		viewProcessorsFactory = new ViewProcessorsFactory(context);
		viewpointProcessorsFactory = new ViewpointProcessorsFactory(context);	
	}

	@EPackageNodeProcessorFactory(
			label = "Enterprise Model",
			icon = "https://img.icons8.com/color/48/client-company.png",
			description = "A model of an enterprise operating on semantic domains",
			documentation =  """		
				A model of an enterprise and its relationship to semantic domains it operates on.
										
				```drawio-resource
				enterprise.drawio
				```						
						
				This model can be used to:
				
				* Establish a shared terminology and drive understanding of enterprise information pathways
				* Document a particular enterprise - mission, stakeholders, concerns, ...
				* Continously adjust the enterprise to improve its efficiency by identifying and refining views, messages, channels and other elements
				
				One way to think about improvement of efficiency is minimization of the "loss function" - total amount of effort required to 
				successfully pass messages between stakeholders.
				I.e. the receiving stakholder(s) fully understand the intent of the sender stakholder(s). 
				This function is highly dependent on the structure of the enterprise. 
				For example, a co-located team of senior developers might need just a whiteboard.
				At the same time an open source project with multiple contributors and consumers/users from around the globe wouldn't be able to function with just a whiteboard.    				  										
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	
		
}
