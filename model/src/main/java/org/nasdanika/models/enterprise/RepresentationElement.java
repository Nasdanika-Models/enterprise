/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.RepresentationElement#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationElement()
 * @model
 * @generated
 */
public interface RepresentationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.enterprise.SemanticElement#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationElement_Represents()
	 * @see org.nasdanika.models.enterprise.SemanticElement#getRepresentedBy
	 * @model opposite="representedBy"
	 * @generated
	 */
	EList<SemanticElement> getRepresents();

} // RepresentationElement
