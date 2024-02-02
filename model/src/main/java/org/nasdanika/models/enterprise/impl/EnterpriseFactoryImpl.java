/**
 */
package org.nasdanika.models.enterprise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.enterprise.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseFactoryImpl extends EFactoryImpl implements EnterpriseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnterpriseFactory init() {
		try {
			EnterpriseFactory theEnterpriseFactory = (EnterpriseFactory)EPackage.Registry.INSTANCE.getEFactory(EnterprisePackage.eNS_URI);
			if (theEnterpriseFactory != null) {
				return theEnterpriseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnterpriseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EnterprisePackage.ENTERPRISE: return createEnterprise();
			case EnterprisePackage.STAKEHOLDER: return createStakeholder();
			case EnterprisePackage.CONCERN: return createConcern();
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND: return createSemanticDomainKind();
			case EnterprisePackage.SEMANTIC_DOMAIN: return createSemanticDomain();
			case EnterprisePackage.SEMANTIC_ELEMENT_KIND: return createSemanticElementKind();
			case EnterprisePackage.SEMANTIC_ELEMENT: return createSemanticElement();
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION: return createSemanticDomainDescription();
			case EnterprisePackage.VIEWPOINT: return createViewpoint();
			case EnterprisePackage.VIEW: return createView();
			case EnterprisePackage.MESSAGE: return createMessage();
			case EnterprisePackage.CHANNEL: return createChannel();
			case EnterprisePackage.REPRESENTATION_KIND: return createRepresentationKind();
			case EnterprisePackage.REPRESENTATION_ELEMENT_KIND: return createRepresentationElementKind();
			case EnterprisePackage.REPRESENTATION: return createRepresentation();
			case EnterprisePackage.REPRESENTATION_ELEMENT: return createRepresentationElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enterprise createEnterprise() {
		EnterpriseImpl enterprise = new EnterpriseImpl();
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concern createConcern() {
		ConcernImpl concern = new ConcernImpl();
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticDomainKind createSemanticDomainKind() {
		SemanticDomainKindImpl semanticDomainKind = new SemanticDomainKindImpl();
		return semanticDomainKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticDomain createSemanticDomain() {
		SemanticDomainImpl semanticDomain = new SemanticDomainImpl();
		return semanticDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticElementKind createSemanticElementKind() {
		SemanticElementKindImpl semanticElementKind = new SemanticElementKindImpl();
		return semanticElementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticElement createSemanticElement() {
		SemanticElementImpl semanticElement = new SemanticElementImpl();
		return semanticElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticDomainDescription createSemanticDomainDescription() {
		SemanticDomainDescriptionImpl semanticDomainDescription = new SemanticDomainDescriptionImpl();
		return semanticDomainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Viewpoint createViewpoint() {
		ViewpointImpl viewpoint = new ViewpointImpl();
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepresentationKind createRepresentationKind() {
		RepresentationKindImpl representationKind = new RepresentationKindImpl();
		return representationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepresentationElementKind createRepresentationElementKind() {
		RepresentationElementKindImpl representationElementKind = new RepresentationElementKindImpl();
		return representationElementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepresentationElement createRepresentationElement() {
		RepresentationElementImpl representationElement = new RepresentationElementImpl();
		return representationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnterprisePackage getEnterprisePackage() {
		return (EnterprisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnterprisePackage getPackage() {
		return EnterprisePackage.eINSTANCE;
	}

} //EnterpriseFactoryImpl
