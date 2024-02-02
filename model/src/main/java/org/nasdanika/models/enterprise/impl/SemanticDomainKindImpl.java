/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.SemanticDomain;
import org.nasdanika.models.enterprise.SemanticDomainKind;
import org.nasdanika.models.enterprise.SemanticElementKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Domain Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.SemanticDomainKindImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticDomainKindImpl extends MinimalEObjectImpl.Container implements SemanticDomainKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticDomainKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.SEMANTIC_DOMAIN_KIND;
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
	public EList<SemanticDomain> getGoverns() {
		return (EList<SemanticDomain>)eDynamicGet(EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS, EnterprisePackage.Literals.SEMANTIC_DOMAIN_KIND__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SemanticElementKind> getElements() {
		return (EList<SemanticElementKind>)eDynamicGet(EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS, EnterprisePackage.Literals.SEMANTIC_DOMAIN_KIND__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS:
				return getGoverns();
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS:
				return getElements();
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
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS:
				getGoverns().clear();
				getGoverns().addAll((Collection<? extends SemanticDomain>)newValue);
				return;
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SemanticElementKind>)newValue);
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
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS:
				getGoverns().clear();
				return;
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS:
				getElements().clear();
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
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__GOVERNS:
				return !getGoverns().isEmpty();
			case EnterprisePackage.SEMANTIC_DOMAIN_KIND__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticDomainKindImpl
