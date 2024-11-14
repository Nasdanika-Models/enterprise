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

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.REPRESENTATION_ELEMENT_KIND)
public class RepresentationElementKindProcessorsFactory {
	
	private Context context;

	public RepresentationElementKindProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			label = "Representation Element Kind",
			description = "A kind (type/class) of representation elements",
			documentation = 
                    """
					A specification of the conventions for a particular representation element.
					Representation elements are instances of representation element kinds. 
					For example, a cylinder is a representation kind for storage/database components, the [Data Sources](https://rag.nasdanika.org/r0/data-sources/index.html)
					and [Store](https://rag.nasdanika.org/r0/repository/rh/store/index.html) on the
					[RAG](https://rag.nasdanika.org/) component diagram are representation elements of the "Storage/Database" kind. 
					Different colors of "Data Sources" representation may highlight heterogeneity of the data sources - plain text, PDF, HTML. 
					And monochromaticity of the "Store" representation element indicates homogeneity of the "Store" semantic element.
                    """
	)
	public EClassNodeProcessor createRepresentationElementKindProcessor(
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
			classID = EnterprisePackage.REPRESENTATION_ELEMENT_KIND,
			featureID = EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS,
			description = "Semantic element kind(s) represented by this representation element kind"
	)
	public EReferenceNodeProcessor createRepresentsProcessor(
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

} // RepresentationElementKind
