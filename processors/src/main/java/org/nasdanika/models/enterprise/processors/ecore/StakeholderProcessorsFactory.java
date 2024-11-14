/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EReferenceNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.STAKEHOLDER)
public class StakeholderProcessorsFactory {
	
	private Context context;

	public StakeholderProcessorsFactory(Context context) {
		this.context = context;
	}
	
	@EClassifierNodeProcessorFactory(
			description = "An entity having interest in the Enterprise",
			documentation = 
                    """
					Stakeholder is some entity having interest in Enterprise achieving (or not achieving) its mission.
					That entity might be a person, organization, automated agent.
					Parties participating in the enterprise are stakeholders by definition - they have an interest in achieving the mission.
					
					For example, a guy goes fishing. 
					His wife is interested whether he catches anything because it affects what she'd need to cook for dinner. 
					And maybe she hopes that he wouldn't catch anything, so she doesn't have to clean the fish and the eat it - she might prefer chicken or beef.
					Both of them are stakeholders. 
					The guy is a single-stakeholder enterprise - so he is both an enterprise with a mission to catch fish and a participating stakehodler with an interest to catch fish.
					This enterprise also has resources - fishing rods, bait, boat, ...
					The wife is a stakeholder as well, although she is not involved into the enterprise operations - buying bait, fueling the boat, catching fish, ...
					 
					To achieve the enterprise mission stakeholders separate concerns and collaborate by exchanging messages over communication channels.
					
					Even a single stakeholder may have multiple concerns and send messages to self over different channels. 
					For example, create a shopping list (message) in a mobile application (channel) and a TODO list (message) in a paper planner (channel).
                    """
	)
	public EClassNodeProcessor createStakeholderProcessor(
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
			classID = EnterprisePackage.STAKEHOLDER,
			featureID = EnterprisePackage.STAKEHOLDER__CONCERNS,
			label = "Concerns",
			description = "Stakeholder concerns (matters of interest of importance)",
			documentation = """
					A stakeholder has one or more concerns - matters of interest or importance for the stakeholders.
					A stakeholder must have at least one concern - otherwise it woudln't be a stakholder.
					"""
	)
	public EReferenceNodeProcessor createConcernsProcessor(
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
	
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = EnterprisePackage.eNS_URI,
			classID = EnterprisePackage.STAKEHOLDER,
			featureID = EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH,
			label = "Comminicates With",
			description = "Stakeholders to communicate with each other by exchanging messages",
			documentation = """
					Stakeholders to communicate with each other by exchanging messages, including self-messages.
					"""
	)
	public EReferenceNodeProcessor createCommunicatesWithProcessor(
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

} // Stakeholder
