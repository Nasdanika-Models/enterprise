/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.Stakeholder#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Stakeholder#getCommunicatesWith <em>Communicates With</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends EObject {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getStakeholder_Concerns()
	 * @model required="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Communicates With</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates With</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getStakeholder_CommunicatesWith()
	 * @model
	 * @generated
	 */
	EList<Message> getCommunicatesWith();

} // Stakeholder
