import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.enterprise.util.EnterpriseEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.enterprise {
	exports org.nasdanika.models.enterprise;
	exports org.nasdanika.models.enterprise.impl;
	exports org.nasdanika.models.enterprise.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	
	provides CapabilityFactory with EnterpriseEPackageResourceSetCapabilityFactory;
}