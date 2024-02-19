/**
 */
package org.nasdanika.models.enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getDomainKinds <em>Domain Kinds</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getRepresentationKinds <em>Representation Kinds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_Frames()
	 * @model required="true"
	 * @generated
	 */
	EList<Concern> getFrames();

	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_Governs()
	 * @model
	 * @generated
	 */
	EList<View> getGoverns();

	/**
	 * Returns the value of the '<em><b>Domain Kinds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Kinds</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_DomainKinds()
	 * @model required="true"
	 * @generated
	 */
	EList<SemanticDomainKind> getDomainKinds();

	/**
	 * Returns the value of the '<em><b>Representation Kinds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.RepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Kinds</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_RepresentationKinds()
	 * @model required="true"
	 * @generated
	 */
	EList<RepresentationKind> getRepresentationKinds();

} // Viewpoint
