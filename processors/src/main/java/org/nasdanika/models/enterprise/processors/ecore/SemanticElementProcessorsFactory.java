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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_ELEMENT)
public class SemanticElementProcessorsFactory {
	
	private Context context;

	public SemanticElementProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "An element of a semantic domain",
			label = "Semantic Element",
			documentation = 
                    """
					An element of a [semantic domain](../SemanticDomain/index.html) of a specific
					[semantic element kind](../SemanticElementKind/index.html).
					
					For example, [Paul](https://family.models.nasdanika.org/demos/mapping/references/members/paul/index.html) 
					is an element of the [sample family](https://family.models.nasdanika.org/demos/mapping/index.html) semantic domain
					of the [Man](https://family.models.nasdanika.org/references/eClassifiers/Man/index.html) kind
					represented by an image [representation element](../RepresentationElement/index.html)
					on the family diagram [representation](../Representation/index.html).  					
                    """
	)
	public EClassNodeProcessor createSemanticElementProcessor(
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
			classID = EnterprisePackage.SEMANTIC_ELEMENT,
			featureID = EnterprisePackage.SEMANTIC_ELEMENT__REPRESENTED_BY,
			label = "Represented by",
			description = "A semantic element is represented by zero or more representation elements on zero or more representations"
	)
	public EReferenceNodeProcessor createRepresentedByProcessor(
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

} // SemanticElement
