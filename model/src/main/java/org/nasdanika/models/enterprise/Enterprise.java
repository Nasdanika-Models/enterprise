/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.Enterprise#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Enterprise#getStakeholders <em>Stakeholders</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getEnterprise()
 * @model
 * @generated
 */
public interface Enterprise extends EObject {
	/**
	 * Returns the value of the '<em><b>Operates On</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates On</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getEnterprise_OperatesOn()
	 * @model
	 * @generated
	 */
	EList<SemanticDomain> getOperatesOn();

	/**
	 * Returns the value of the '<em><b>Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholders</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getEnterprise_Stakeholders()
	 * @model required="true"
	 * @generated
	 */
	EList<Stakeholder> getStakeholders();

} // Enterprise
