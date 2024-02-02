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
import org.nasdanika.models.enterprise.SemanticDomainDescription;
import org.nasdanika.models.enterprise.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Domain Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.SemanticDomainDescriptionImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticDomainDescriptionImpl extends MinimalEObjectImpl.Container implements SemanticDomainDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticDomainDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.SEMANTIC_DOMAIN_DESCRIPTION;
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
	public EList<SemanticDomain> getDescribes() {
		return (EList<SemanticDomain>)eDynamicGet(EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES, EnterprisePackage.Literals.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<View> getViews() {
		return (EList<View>)eDynamicGet(EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS, EnterprisePackage.Literals.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES:
				return getDescribes();
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS:
				return getViews();
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
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES:
				getDescribes().clear();
				getDescribes().addAll((Collection<? extends SemanticDomain>)newValue);
				return;
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
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
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES:
				getDescribes().clear();
				return;
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS:
				getViews().clear();
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
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__DESCRIBES:
				return !getDescribes().isEmpty();
			case EnterprisePackage.SEMANTIC_DOMAIN_DESCRIPTION__VIEWS:
				return !getViews().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticDomainDescriptionImpl
