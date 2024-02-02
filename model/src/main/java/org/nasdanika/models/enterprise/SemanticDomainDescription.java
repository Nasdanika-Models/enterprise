/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Domain Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticDomainDescription#getDescribes <em>Describes</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticDomainDescription#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainDescription()
 * @model
 * @generated
 */
public interface SemanticDomainDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Describes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainDescription_Describes()
	 * @model required="true"
	 * @generated
	 */
	EList<SemanticDomain> getDescribes();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticDomainDescription_Views()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<View> getViews();

} // SemanticDomainDescription
