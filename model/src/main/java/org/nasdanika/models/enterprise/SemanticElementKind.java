/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Element Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticElementKind#getGoverns <em>Governs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticElementKind()
 * @model
 * @generated
 */
public interface SemanticElementKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticElementKind_Governs()
	 * @model
	 * @generated
	 */
	EList<SemanticElement> getGoverns();

} // SemanticElementKind
