/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Element Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.RepresentationElementKind#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationElementKind()
 * @model
 * @generated
 */
public interface RepresentationElementKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticElementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getRepresentationElementKind_Represents()
	 * @model
	 * @generated
	 */
	EList<SemanticElementKind> getRepresents();

} // RepresentationElementKind
