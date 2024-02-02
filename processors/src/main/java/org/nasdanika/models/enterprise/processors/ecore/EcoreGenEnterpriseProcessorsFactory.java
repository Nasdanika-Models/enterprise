package org.nasdanika.models.enterprise.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EPackageNodeProcessorFactory(nsURI = EnterprisePackage.eNS_URI)
public class EcoreGenEnterpriseProcessorsFactory {

	private Context context;
	
	
	public EcoreGenEnterpriseProcessorsFactory(Context context) {
		this.context = context;
	}
	
}
