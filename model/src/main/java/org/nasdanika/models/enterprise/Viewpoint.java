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
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.Viewpoint#getRepresentations <em>Representations</em>}</li>
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
	 * Returns the value of the '<em><b>Domains</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.SemanticDomainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_Domains()
	 * @model required="true"
	 * @generated
	 */
	EList<SemanticDomainKind> getDomains();

	/**
	 * Returns the value of the '<em><b>Representations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.enterprise.RepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' reference list.
	 * @see org.nasdanika.models.enterprise.EnterprisePackage#getViewpoint_Representations()
	 * @model required="true"
	 * @generated
	 */
	EList<RepresentationKind> getRepresentations();

} // Viewpoint
