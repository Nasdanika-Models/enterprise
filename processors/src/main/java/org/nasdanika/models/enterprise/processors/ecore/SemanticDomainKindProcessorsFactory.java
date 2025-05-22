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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.SEMANTIC_DOMAIN_KIND)
public class SemanticDomainKindProcessorsFactory {
	
	private Context context;

	public SemanticDomainKindProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "A metamodel of a semantic domain",
			label = "Semantic Domain Kind",
			documentation = 
                    """
					Simply put, "Semantic Domain" ≈ terminology, jargon, lingo. 
					More precisely, "an area of meaning and the words used to talk about it ..."[^semantic_domain]
					
					[^semantic_domain]: https://en.wikipedia.org/wiki/Semantic_domain
					
					In this model the above definition is divided into:
					
					* Semantic Domain Kind - the metamodel. For example, Book Class (Kind) contains Chapter Class (Kind). Another example is the [Family Model](https://family.models.nasdanika.org/index.html) 
					* Semantic Domain - the model, instances of classes/kinds. For example [Beyond Diagrams](https://leanpub.com/beyond-diagrams)
					book contains "Terminology (Semantic Domain)" chapter. 
					An enterprise operates on one or more semantic domains. E.g. an author writes one or more books.
					[Sample Family](https://nasdanika-demos.github.io/family-semantic-mapping/index.html) is a semantic domain of ``Family`` semantic domain kind.
					
					"Kind" is one of the terms which cause confusion. A synonym for Kind is "Type", or "Class" in languages like Java,
					or (maybe), "Prototype" in languages like JavaScript.
					One way to think about is an empty paper or web form. 
					A form for a person would have fields for "First name", "Last name" and "Date of birth" with no values.
					An instance of a kind/type/class/prototype is a filled-out form with, say "John" for the first name and "Smith" for the last name.
					Instantiation is taking an empty form, making a copy of it, and then filling it out.
                    """
	)
	public EClassNodeProcessor createSemanticDomainKindProcessor(
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
			classID = EnterprisePackage.SEMANTIC_DOMAIN_KIND,
			featureID = EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS,
			description = "Semantic domain kind governs (constrols structure) of semantic domains of its kind"
	)
	public EReferenceNodeProcessor createGovernsProcessor(
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
			classID = EnterprisePackage.SEMANTIC_DOMAIN_KIND,
			featureID = EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS,
			description = "Elements of this semantic domain kind"
	)
	public EReferenceNodeProcessor createElementsProcessor(
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

} // SemanticDomainKind
