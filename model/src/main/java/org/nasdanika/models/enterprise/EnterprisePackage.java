/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.enterprise.EnterpriseFactory
 * @model kind="package"
 * @generated
 */
public interface EnterprisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enterprise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/enterprise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.enterprise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterprisePackage eINSTANCE = org.nasdanika.models.enterprise.impl.EnterprisePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.EnterpriseImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 0;

	/**
	 * The feature id for the '<em><b>Operates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__OPERATES_ON = 0;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__STAKEHOLDERS = 1;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.StakeholderImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 1;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONCERNS = 0;

	/**
	 * The feature id for the '<em><b>Communicates With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__COMMUNICATES_WITH = 1;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.ConcernImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 2;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl <em>Semantic Domain Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomainKind()
	 * @generated
	 */
	int SEMANTIC_DOMAIN_KIND = 3;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_KIND__GOVERNS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_KIND__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Semantic Domain Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_KIND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semantic Domain Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainImpl <em>Semantic Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.SemanticDomainImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomain()
	 * @generated
	 */
	int SEMANTIC_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Semantic Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantic Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.SemanticElementKindImpl <em>Semantic Element Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.SemanticElementKindImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticElementKind()
	 * @generated
	 */
	int SEMANTIC_ELEMENT_KIND = 5;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT_KIND__GOVERNS = 0;

	/**
	 * The number of structural features of the '<em>Semantic Element Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT_KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantic Element Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.SemanticElementImpl <em>Semantic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.SemanticElementImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticElement()
	 * @generated
	 */
	int SEMANTIC_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT__REPRESENTED_BY = 0;

	/**
	 * The number of structural features of the '<em>Semantic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl <em>Semantic Domain Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomainDescription()
	 * @generated
	 */
	int SEMANTIC_DOMAIN_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_DESCRIPTION__VIEWS = 1;

	/**
	 * The number of structural features of the '<em>Semantic Domain Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semantic Domain Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.ViewpointImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 8;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__FRAMES = 0;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__GOVERNS = 1;

	/**
	 * The feature id for the '<em><b>Domain Kinds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__DOMAIN_KINDS = 2;

	/**
	 * The feature id for the '<em><b>Representation Kinds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__REPRESENTATION_KINDS = 3;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.ViewImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 9;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REPRESENTATIONS = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.MessageImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__REPRESENTATIONS = VIEW__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Delivered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DELIVERED_BY = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.ChannelImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 11;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.RepresentationKindImpl <em>Representation Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.RepresentationKindImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationKind()
	 * @generated
	 */
	int REPRESENTATION_KIND = 12;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_KIND__GOVERNS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_KIND__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_KIND__DOMAINS = 2;

	/**
	 * The number of structural features of the '<em>Representation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_KIND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Representation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.RepresentationElementKindImpl <em>Representation Element Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.RepresentationElementKindImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationElementKind()
	 * @generated
	 */
	int REPRESENTATION_ELEMENT_KIND = 13;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_KIND__REPRESENTS = 0;

	/**
	 * The number of structural features of the '<em>Representation Element Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation Element Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.RepresentationImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 14;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.enterprise.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.enterprise.impl.RepresentationElementImpl
	 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationElement()
	 * @generated
	 */
	int REPRESENTATION_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT__REPRESENTS = 0;

	/**
	 * The number of structural features of the '<em>Representation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see org.nasdanika.models.enterprise.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Enterprise#getOperatesOn <em>Operates On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operates On</em>'.
	 * @see org.nasdanika.models.enterprise.Enterprise#getOperatesOn()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_OperatesOn();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Enterprise#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see org.nasdanika.models.enterprise.Enterprise#getStakeholders()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Stakeholders();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see org.nasdanika.models.enterprise.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Stakeholder#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns</em>'.
	 * @see org.nasdanika.models.enterprise.Stakeholder#getConcerns()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_Concerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Stakeholder#getCommunicatesWith <em>Communicates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicates With</em>'.
	 * @see org.nasdanika.models.enterprise.Stakeholder#getCommunicatesWith()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_CommunicatesWith();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.nasdanika.models.enterprise.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.SemanticDomainKind <em>Semantic Domain Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Domain Kind</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainKind
	 * @generated
	 */
	EClass getSemanticDomainKind();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.SemanticDomainKind#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainKind#getGoverns()
	 * @see #getSemanticDomainKind()
	 * @generated
	 */
	EReference getSemanticDomainKind_Governs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.SemanticDomainKind#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainKind#getElements()
	 * @see #getSemanticDomainKind()
	 * @generated
	 */
	EReference getSemanticDomainKind_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.SemanticDomain <em>Semantic Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Domain</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomain
	 * @generated
	 */
	EClass getSemanticDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.SemanticDomain#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomain#getElements()
	 * @see #getSemanticDomain()
	 * @generated
	 */
	EReference getSemanticDomain_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.SemanticElementKind <em>Semantic Element Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Element Kind</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticElementKind
	 * @generated
	 */
	EClass getSemanticElementKind();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.SemanticElementKind#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticElementKind#getGoverns()
	 * @see #getSemanticElementKind()
	 * @generated
	 */
	EReference getSemanticElementKind_Governs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.SemanticElement <em>Semantic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Element</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticElement
	 * @generated
	 */
	EClass getSemanticElement();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.SemanticElement#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represented By</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticElement#getRepresentedBy()
	 * @see #getSemanticElement()
	 * @generated
	 */
	EReference getSemanticElement_RepresentedBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.SemanticDomainDescription <em>Semantic Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Domain Description</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainDescription
	 * @generated
	 */
	EClass getSemanticDomainDescription();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.SemanticDomainDescription#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describes</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainDescription#getDescribes()
	 * @see #getSemanticDomainDescription()
	 * @generated
	 */
	EReference getSemanticDomainDescription_Describes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.SemanticDomainDescription#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.nasdanika.models.enterprise.SemanticDomainDescription#getViews()
	 * @see #getSemanticDomainDescription()
	 * @generated
	 */
	EReference getSemanticDomainDescription_Views();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.nasdanika.models.enterprise.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Viewpoint#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frames</em>'.
	 * @see org.nasdanika.models.enterprise.Viewpoint#getFrames()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Frames();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Viewpoint#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs</em>'.
	 * @see org.nasdanika.models.enterprise.Viewpoint#getGoverns()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Governs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Viewpoint#getDomainKinds <em>Domain Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Kinds</em>'.
	 * @see org.nasdanika.models.enterprise.Viewpoint#getDomainKinds()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_DomainKinds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Viewpoint#getRepresentationKinds <em>Representation Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation Kinds</em>'.
	 * @see org.nasdanika.models.enterprise.Viewpoint#getRepresentationKinds()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_RepresentationKinds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.nasdanika.models.enterprise.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.View#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see org.nasdanika.models.enterprise.View#getRepresentations()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Representations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.nasdanika.models.enterprise.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.Message#getDeliveredBy <em>Delivered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivered By</em>'.
	 * @see org.nasdanika.models.enterprise.Message#getDeliveredBy()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_DeliveredBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.nasdanika.models.enterprise.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.RepresentationKind <em>Representation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Kind</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationKind
	 * @generated
	 */
	EClass getRepresentationKind();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.RepresentationKind#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationKind#getGoverns()
	 * @see #getRepresentationKind()
	 * @generated
	 */
	EReference getRepresentationKind_Governs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.RepresentationKind#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationKind#getElements()
	 * @see #getRepresentationKind()
	 * @generated
	 */
	EReference getRepresentationKind_Elements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.RepresentationKind#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationKind#getDomains()
	 * @see #getRepresentationKind()
	 * @generated
	 */
	EReference getRepresentationKind_Domains();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.RepresentationElementKind <em>Representation Element Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Element Kind</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationElementKind
	 * @generated
	 */
	EClass getRepresentationElementKind();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.RepresentationElementKind#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represents</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationElementKind#getRepresents()
	 * @see #getRepresentationElementKind()
	 * @generated
	 */
	EReference getRepresentationElementKind_Represents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see org.nasdanika.models.enterprise.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.enterprise.Representation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.enterprise.Representation#getElements()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.enterprise.RepresentationElement <em>Representation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Element</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationElement
	 * @generated
	 */
	EClass getRepresentationElement();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.enterprise.RepresentationElement#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represents</em>'.
	 * @see org.nasdanika.models.enterprise.RepresentationElement#getRepresents()
	 * @see #getRepresentationElement()
	 * @generated
	 */
	EReference getRepresentationElement_Represents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnterpriseFactory getEnterpriseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.EnterpriseImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getEnterprise()
		 * @generated
		 */
		EClass ENTERPRISE = eINSTANCE.getEnterprise();

		/**
		 * The meta object literal for the '<em><b>Operates On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__OPERATES_ON = eINSTANCE.getEnterprise_OperatesOn();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__STAKEHOLDERS = eINSTANCE.getEnterprise_Stakeholders();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.StakeholderImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__CONCERNS = eINSTANCE.getStakeholder_Concerns();

		/**
		 * The meta object literal for the '<em><b>Communicates With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__COMMUNICATES_WITH = eINSTANCE.getStakeholder_CommunicatesWith();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.ConcernImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl <em>Semantic Domain Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomainKind()
		 * @generated
		 */
		EClass SEMANTIC_DOMAIN_KIND = eINSTANCE.getSemanticDomainKind();

		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN_KIND__GOVERNS = eINSTANCE.getSemanticDomainKind_Governs();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN_KIND__ELEMENTS = eINSTANCE.getSemanticDomainKind_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainImpl <em>Semantic Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.SemanticDomainImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomain()
		 * @generated
		 */
		EClass SEMANTIC_DOMAIN = eINSTANCE.getSemanticDomain();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN__ELEMENTS = eINSTANCE.getSemanticDomain_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.SemanticElementKindImpl <em>Semantic Element Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.SemanticElementKindImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticElementKind()
		 * @generated
		 */
		EClass SEMANTIC_ELEMENT_KIND = eINSTANCE.getSemanticElementKind();

		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ELEMENT_KIND__GOVERNS = eINSTANCE.getSemanticElementKind_Governs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.SemanticElementImpl <em>Semantic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.SemanticElementImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticElement()
		 * @generated
		 */
		EClass SEMANTIC_ELEMENT = eINSTANCE.getSemanticElement();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ELEMENT__REPRESENTED_BY = eINSTANCE.getSemanticElement_RepresentedBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl <em>Semantic Domain Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getSemanticDomainDescription()
		 * @generated
		 */
		EClass SEMANTIC_DOMAIN_DESCRIPTION = eINSTANCE.getSemanticDomainDescription();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES = eINSTANCE.getSemanticDomainDescription_Describes();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN_DESCRIPTION__VIEWS = eINSTANCE.getSemanticDomainDescription_Views();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.ViewpointImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__FRAMES = eINSTANCE.getViewpoint_Frames();

		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__GOVERNS = eINSTANCE.getViewpoint_Governs();

		/**
		 * The meta object literal for the '<em><b>Domain Kinds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__DOMAIN_KINDS = eINSTANCE.getViewpoint_DomainKinds();

		/**
		 * The meta object literal for the '<em><b>Representation Kinds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__REPRESENTATION_KINDS = eINSTANCE.getViewpoint_RepresentationKinds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.ViewImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__REPRESENTATIONS = eINSTANCE.getView_Representations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.MessageImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Delivered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__DELIVERED_BY = eINSTANCE.getMessage_DeliveredBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.ChannelImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.RepresentationKindImpl <em>Representation Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.RepresentationKindImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationKind()
		 * @generated
		 */
		EClass REPRESENTATION_KIND = eINSTANCE.getRepresentationKind();

		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_KIND__GOVERNS = eINSTANCE.getRepresentationKind_Governs();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_KIND__ELEMENTS = eINSTANCE.getRepresentationKind_Elements();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_KIND__DOMAINS = eINSTANCE.getRepresentationKind_Domains();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.RepresentationElementKindImpl <em>Representation Element Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.RepresentationElementKindImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationElementKind()
		 * @generated
		 */
		EClass REPRESENTATION_ELEMENT_KIND = eINSTANCE.getRepresentationElementKind();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_ELEMENT_KIND__REPRESENTS = eINSTANCE.getRepresentationElementKind_Represents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.RepresentationImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__ELEMENTS = eINSTANCE.getRepresentation_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.enterprise.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.enterprise.impl.RepresentationElementImpl
		 * @see org.nasdanika.models.enterprise.impl.EnterprisePackageImpl#getRepresentationElement()
		 * @generated
		 */
		EClass REPRESENTATION_ELEMENT = eINSTANCE.getRepresentationElement();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_ELEMENT__REPRESENTS = eINSTANCE.getRepresentationElement_Represents();

	}

} //EnterprisePackage
