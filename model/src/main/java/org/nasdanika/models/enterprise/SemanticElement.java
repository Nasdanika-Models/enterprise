/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.SemanticElement#getRepresentedBy <em>Represented By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticElement()
 * @model
 * @generated
 */
public interface SemanticElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.RepresentationElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.enterprise.RepresentationElement#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getSemanticElement_RepresentedBy()
	 * @see org.nasdanika.models.enterprise.RepresentationElement#getRepresents
	 * @model opposite="represents"
	 * @generated
	 */
	EList<RepresentationElement> getRepresentedBy();

} // SemanticElement
