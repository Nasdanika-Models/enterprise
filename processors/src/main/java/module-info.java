module org.nasdanika.models.enterprise.processors {
		
	requires transitive org.nasdanika.models.enterprise;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.enterprise.processors.ecore;
	opens org.nasdanika.models.enterprise.processors.ecore; // For loading resources
	
}
