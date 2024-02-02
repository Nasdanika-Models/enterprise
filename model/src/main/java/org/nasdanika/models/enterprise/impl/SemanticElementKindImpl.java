/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.SemanticElement;
import org.nasdanika.models.enterprise.SemanticElementKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Element Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.SemanticElementKindImpl#getGoverns <em>Governs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticElementKindImpl extends MinimalEObjectImpl.Container implements SemanticElementKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticElementKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.SEMANTIC_ELEMENT_KIND;
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
	public EList<SemanticElement> getGoverns() {
		return (EList<SemanticElement>)eDynamicGet(EnterprisePackage.SEMANTIC_ELEMENT_KIND__GOVERNS, EnterprisePackage.Literals.SEMANTIC_ELEMENT_KIND__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.SEMANTIC_ELEMENT_KIND__GOVERNS:
				return getGoverns();
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
			case EnterprisePackage.SEMANTIC_ELEMENT_KIND__GOVERNS:
				getGoverns().clear();
				getGoverns().addAll((Collection<? extends SemanticElement>)newValue);
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
			case EnterprisePackage.SEMANTIC_ELEMENT_KIND__GOVERNS:
				getGoverns().clear();
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
			case EnterprisePackage.SEMANTIC_ELEMENT_KIND__GOVERNS:
				return !getGoverns().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticElementKindImpl
