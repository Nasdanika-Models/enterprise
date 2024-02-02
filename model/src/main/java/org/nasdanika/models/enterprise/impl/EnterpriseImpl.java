/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.enterprise.Enterprise;
import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.SemanticDomain;
import org.nasdanika.models.enterprise.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.EnterpriseImpl#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.EnterpriseImpl#getStakeholders <em>Stakeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseImpl extends MinimalEObjectImpl.Container implements Enterprise {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.ENTERPRISE;
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
	public EList<SemanticDomain> getOperatesOn() {
		return (EList<SemanticDomain>)eDynamicGet(EnterprisePackage.ENTERPRISE__OPERATES_ON, EnterprisePackage.Literals.ENTERPRISE__OPERATES_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Stakeholder> getStakeholders() {
		return (EList<Stakeholder>)eDynamicGet(EnterprisePackage.ENTERPRISE__STAKEHOLDERS, EnterprisePackage.Literals.ENTERPRISE__STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.ENTERPRISE__OPERATES_ON:
				return getOperatesOn();
			case EnterprisePackage.ENTERPRISE__STAKEHOLDERS:
				return getStakeholders();
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
			case EnterprisePackage.ENTERPRISE__OPERATES_ON:
				getOperatesOn().clear();
				getOperatesOn().addAll((Collection<? extends SemanticDomain>)newValue);
				return;
			case EnterprisePackage.ENTERPRISE__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
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
			case EnterprisePackage.ENTERPRISE__OPERATES_ON:
				getOperatesOn().clear();
				return;
			case EnterprisePackage.ENTERPRISE__STAKEHOLDERS:
				getStakeholders().clear();
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
			case EnterprisePackage.ENTERPRISE__OPERATES_ON:
				return !getOperatesOn().isEmpty();
			case EnterprisePackage.ENTERPRISE__STAKEHOLDERS:
				return !getStakeholders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseImpl
