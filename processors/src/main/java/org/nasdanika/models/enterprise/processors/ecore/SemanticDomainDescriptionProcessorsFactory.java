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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION)
public class SemanticDomainDescriptionProcessorsFactory {
	
	private Context context;

	public SemanticDomainDescriptionProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "A collection of views into a set of semantic domains, on which the enterprise operates, addressing a set of stakeholder concerns",
			label = "Semantic Domain Description",
			documentation = 
                    """
					Semantic Domain Description is a collection of [views](../View/index.html) into a set of 
					[semantic domains](../SemanticDomain/index.html), on which the [enterprise](../Enterprise/index.html) operates,
					addressing a set of [stakeholder](../Stakeholder/index.html) [concerns](../Concern/index.html). 	
					
					[Sample Family](https://family.models.nasdanika.org/demos/mapping/index.html) is an example of a
					semantic domain description which describes the eponymous semantic domain of [Family](https://family.models.nasdanika.org/index.html)
					semantic domain kind.								
                    """
	)
	public EClassNodeProcessor createSemanticDomainDescriptionProcessor(
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
			classID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION,
			featureID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES,
			description = "Semantic domains described by this description"
	)
	public EReferenceNodeProcessor createDescribesProcessor(
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
			classID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION,
			featureID = EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS,
			description = "Views constituting the description"
	)
	public EReferenceNodeProcessor createViewsProcessor(
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

//	EList<ViewProcessorsFactory> getViews();

} // SemanticDomainDescription
