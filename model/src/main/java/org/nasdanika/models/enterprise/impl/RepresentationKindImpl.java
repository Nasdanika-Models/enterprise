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
import org.nasdanika.models.enterprise.Representation;
import org.nasdanika.models.enterprise.RepresentationElementKind;
import org.nasdanika.models.enterprise.RepresentationKind;
import org.nasdanika.models.enterprise.SemanticDomainKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.RepresentationKindImpl#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.RepresentationKindImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.RepresentationKindImpl#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationKindImpl extends MinimalEObjectImpl.Container implements RepresentationKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.REPRESENTATION_KIND;
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
	public EList<Representation> getGoverns() {
		return (EList<Representation>)eDynamicGet(EnterprisePackage.REPRESENTATION_KIND__GOVERNS, EnterprisePackage.Literals.REPRESENTATION_KIND__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RepresentationElementKind> getElements() {
		return (EList<RepresentationElementKind>)eDynamicGet(EnterprisePackage.REPRESENTATION_KIND__ELEMENTS, EnterprisePackage.Literals.REPRESENTATION_KIND__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SemanticDomainKind> getDomains() {
		return (EList<SemanticDomainKind>)eDynamicGet(EnterprisePackage.REPRESENTATION_KIND__DOMAINS, EnterprisePackage.Literals.REPRESENTATION_KIND__DOMAINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnterprisePackage.REPRESENTATION_KIND__ELEMENTS:
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
			case EnterprisePackage.REPRESENTATION_KIND__GOVERNS:
				return getGoverns();
			case EnterprisePackage.REPRESENTATION_KIND__ELEMENTS:
				return getElements();
			case EnterprisePackage.REPRESENTATION_KIND__DOMAINS:
				return getDomains();
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
			case EnterprisePackage.REPRESENTATION_KIND__GOVERNS:
				getGoverns().clear();
				getGoverns().addAll((Collection<? extends Representation>)newValue);
				return;
			case EnterprisePackage.REPRESENTATION_KIND__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends RepresentationElementKind>)newValue);
				return;
			case EnterprisePackage.REPRESENTATION_KIND__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends SemanticDomainKind>)newValue);
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
			case EnterprisePackage.REPRESENTATION_KIND__GOVERNS:
				getGoverns().clear();
				return;
			case EnterprisePackage.REPRESENTATION_KIND__ELEMENTS:
				getElements().clear();
				return;
			case EnterprisePackage.REPRESENTATION_KIND__DOMAINS:
				getDomains().clear();
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
			case EnterprisePackage.REPRESENTATION_KIND__GOVERNS:
				return !getGoverns().isEmpty();
			case EnterprisePackage.REPRESENTATION_KIND__ELEMENTS:
				return !getElements().isEmpty();
			case EnterprisePackage.REPRESENTATION_KIND__DOMAINS:
				return !getDomains().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepresentationKindImpl
