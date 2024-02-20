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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.ENTERPRISE)
public class EnterpriseProcessorsFactory {
	
	private Context context;

	public EnterpriseProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "A group of parties (stakeholders) and resources devoted to achieving a mission",
			documentation = 
                    """
					One definition of an enterprise is "A group of people and resources devoted to achieving a mission."[^ea-by-example]
					We will use the term "stakeholder" instead of "people".
					A stakeholder can be a person, an organization/another enterprise, or an automated agent, including AI agents.
					
					[^ea-by-example]: [Enterprise Architecture by Example](https://www.udemy.com/course/enterprise-architecture-by-example/) 
					
					Note that an enterprise may have a single stakeholder. 
					Going fishing alone or with friends is an enterprise.
					Writing a book is also an enterprise.
					
					An enterprise operates on one or more semantic domains. 
					For example, the book domain - author, reader, publisher, book, chapter, ...
					
					Enterprises can be nested and interrelated. 
					A classic example is a company with departments depending on each other.
					This model does not reflect this aspect for brevity.
                    """
	)
	public EClassNodeProcessor createEnterpriseProcessor(
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
			classID = EnterprisePackage.ENTERPRISE,
			featureID = EnterprisePackage.ENTERPRISE__OPERATES_ON,
			label = "Operates on",
			description = "An enterprise operates on one or more semantic domains",
			documentation = """
					An enterprise operates on one or more semantic domains. 
					For example, an Agile team developing Spring microservices to be deployed to Kubernetes operates on 
					at least three semantic domains - Agile (stories, sprints, ...), Spring (controllers, ...), and Kubernetes (deployments, images, ...)
					"""
	)
	public EReferenceNodeProcessor createOperatesOnProcessor(
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
			classID = EnterprisePackage.ENTERPRISE,
			featureID = EnterprisePackage.ENTERPRISE__STAKEHOLDERS,
			label = "Stakeholders",
			description = "An enterprise has one ore more stakeholders",
			documentation = """
					An enterprise has one ore more stakeholders. 
					Some stakehodlers may participate in the operations of the enterprise
					to achieve its mission. 
					Some others may have an interest, but not participate in achieving the mission. 
					They may even be interested in the enterprise not achieving its mission!
					"""
	)
	public EReferenceNodeProcessor createStakeholdersProcessor(
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

//	EList<SemanticDomainProcessorsFactory> getOperatesOn();
//	EList<StakeholderProcessorsFactory> getStakeholders();

} // Enterprise
