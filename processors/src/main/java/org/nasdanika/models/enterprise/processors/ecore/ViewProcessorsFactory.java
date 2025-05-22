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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.VIEW)
public class ViewProcessorsFactory {
	
	protected Context context;

	public ViewProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "A group of related representations of semantic domain elements of interest from the perspective of a related set of concerns",
			documentation = 
                    """
					View is a group of related [representations](../Representation/index.html)
					of [semantic domain](../SemanticDomain/index.html) [elements](../SemanticElement/index.html)
					of interest from the perspective of a related set of [concerns](../Concern/index.html).
					
					A LinkedIn profile is a view which contains "Profile photo" image representation and "Experience" list of cards representation.
					
					Another example, a [web page](https://rag.nasdanika.org/) with a component diagram, a list of component descriptions, 
					and a sequence diagram showing components interaction is a view
					addressing stakeholder's concern of getting familiar with the system/solution.
					Diagrams and descriptions are representations.
					
					Another example is the [Sample Family home page](https://nasdanika-demos.github.io/family-semantic-mapping/index.html) view
					with a family diagram representation addressing the "What" concern
					and several other representations addressing the "How" concern
					of a "potential user" stakeholder.  					
                    """
	)
	public EClassNodeProcessor createViewProcessor(
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
			classID = EnterprisePackage.VIEW,
			featureID = EnterprisePackage.VIEW__REPRESENTATIONS,
			label = "Delivered by",
			description = "Representations constituting this view"
	)
	public EReferenceNodeProcessor createRepresentationsProcessor(
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

} // View
