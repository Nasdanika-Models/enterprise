/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.Message#getDeliveredBy <em>Delivered By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends View {
	/**
	 * Returns the value of the '<em><b>Delivered By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivered By</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getMessage_DeliveredBy()
	 * @model
	 * @generated
	 */
	EList<Channel> getDeliveredBy();

} // Message
