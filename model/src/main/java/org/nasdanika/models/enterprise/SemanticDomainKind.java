/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Domain Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticDomainKind#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticDomainKind#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainKind()
 * @model
 * @generated
 */
public interface SemanticDomainKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainKind_Governs()
	 * @model
	 * @generated
	 */
	EList<SemanticDomain> getGoverns();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticElementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainKind_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SemanticElementKind> getElements();

} // SemanticDomainKind
