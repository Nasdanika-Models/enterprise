/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.RepresentationElementKind;
import org.nasdanika.models.enterprise.SemanticElementKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Element Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.RepresentationElementKindImpl#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationElementKindImpl extends MinimalEObjectImpl.Container implements RepresentationElementKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationElementKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.REPRESENTATION_ELEMENT_KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SemanticElementKind> getRepresents() {
		return (EList<SemanticElementKind>)eDynamicGet(EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS, EnterprisePackage.Literals.REPRESENTATION_ELEMENT_KIND__REPRESENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS:
				return getRepresents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS:
				getRepresents().clear();
				getRepresents().addAll((Collection<? extends SemanticElementKind>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS:
				getRepresents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EnterprisePackage.REPRESENTATION_ELEMENT_KIND__REPRESENTS:
				return !getRepresents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepresentationElementKindImpl
