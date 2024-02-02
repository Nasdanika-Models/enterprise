/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.RepresentationKind#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.RepresentationKind#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.RepresentationKind#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationKind()
 * @model
 * @generated
 */
public interface RepresentationKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Representation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationKind_Governs()
	 * @model
	 * @generated
	 */
	EList<Representation> getGoverns();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.RepresentationElementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationKind_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationElementKind> getElements();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationKind_Domains()
	 * @model required="true"
	 * @generated
	 */
	EList<SemanticDomainKind> getDomains();

} // RepresentationKind
