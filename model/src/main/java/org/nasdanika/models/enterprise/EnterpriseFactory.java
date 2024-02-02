/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.enterprise.EnterprisePackage
 * @generated
 */
public interface EnterpriseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterpriseFactory eINSTANCE = org.nasdanika.models.enterprise.impl.EnterpriseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise</em>'.
	 * @generated
	 */
	Enterprise createEnterprise();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern</em>'.
	 * @generated
	 */
	Concern createConcern();

	/**
	 * Returns a new object of class '<em>Semantic Domain Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Domain Kind</em>'.
	 * @generated
	 */
	SemanticDomainKind createSemanticDomainKind();

	/**
	 * Returns a new object of class '<em>Semantic Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Domain</em>'.
	 * @generated
	 */
	SemanticDomain createSemanticDomain();

	/**
	 * Returns a new object of class '<em>Semantic Element Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Element Kind</em>'.
	 * @generated
	 */
	SemanticElementKind createSemanticElementKind();

	/**
	 * Returns a new object of class '<em>Semantic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Element</em>'.
	 * @generated
	 */
	SemanticElement createSemanticElement();

	/**
	 * Returns a new object of class '<em>Semantic Domain Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Domain Description</em>'.
	 * @generated
	 */
	SemanticDomainDescription createSemanticDomainDescription();

	/**
	 * Returns a new object of class '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint</em>'.
	 * @generated
	 */
	Viewpoint createViewpoint();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Representation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Kind</em>'.
	 * @generated
	 */
	RepresentationKind createRepresentationKind();

	/**
	 * Returns a new object of class '<em>Representation Element Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Element Kind</em>'.
	 * @generated
	 */
	RepresentationElementKind createRepresentationElementKind();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Representation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Element</em>'.
	 * @generated
	 */
	RepresentationElement createRepresentationElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnterprisePackage getEnterprisePackage();

} //EnterpriseFactory
