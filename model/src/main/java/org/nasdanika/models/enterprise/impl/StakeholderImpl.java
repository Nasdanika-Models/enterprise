/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.enterprise.Concern;
import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.Message;
import org.nasdanika.models.enterprise.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.StakeholderImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.StakeholderImpl#getCommunicatesWith <em>Communicates With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.STAKEHOLDER;
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
	public EList<Concern> getConcerns() {
		return (EList<Concern>)eDynamicGet(EnterprisePackage.STAKEHOLDER__CONCERNS, EnterprisePackage.Literals.STAKEHOLDER__CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getCommunicatesWith() {
		return (EList<Message>)eDynamicGet(EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH, EnterprisePackage.Literals.STAKEHOLDER__COMMUNICATES_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.STAKEHOLDER__CONCERNS:
				return getConcerns();
			case EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH:
				return getCommunicatesWith();
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
			case EnterprisePackage.STAKEHOLDER__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				getCommunicatesWith().addAll((Collection<? extends Message>)newValue);
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
			case EnterprisePackage.STAKEHOLDER__CONCERNS:
				getConcerns().clear();
				return;
			case EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
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
			case EnterprisePackage.STAKEHOLDER__CONCERNS:
				return !getConcerns().isEmpty();
			case EnterprisePackage.STAKEHOLDER__COMMUNICATES_WITH:
				return !getCommunicatesWith().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StakeholderImpl
