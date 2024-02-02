/**
 */
package org.nasdanika.models.enterprise.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.enterprise.Concern;
import org.nasdanika.models.enterprise.EnterprisePackage;
import org.nasdanika.models.enterprise.RepresentationKind;
import org.nasdanika.models.enterprise.SemanticDomainKind;
import org.nasdanika.models.enterprise.View;
import org.nasdanika.models.enterprise.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.enterprise.impl.ViewpointImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.ViewpointImpl#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.ViewpointImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.nasdanika.models.enterprise.impl.ViewpointImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointImpl extends MinimalEObjectImpl.Container implements Viewpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.VIEWPOINT;
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
	public EList<Concern> getFrames() {
		return (EList<Concern>)eDynamicGet(EnterprisePackage.VIEWPOINT__FRAMES, EnterprisePackage.Literals.VIEWPOINT__FRAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<View> getGoverns() {
		return (EList<View>)eDynamicGet(EnterprisePackage.VIEWPOINT__GOVERNS, EnterprisePackage.Literals.VIEWPOINT__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SemanticDomainKind> getDomains() {
		return (EList<SemanticDomainKind>)eDynamicGet(EnterprisePackage.VIEWPOINT__DOMAINS, EnterprisePackage.Literals.VIEWPOINT__DOMAINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RepresentationKind> getRepresentations() {
		return (EList<RepresentationKind>)eDynamicGet(EnterprisePackage.VIEWPOINT__REPRESENTATIONS, EnterprisePackage.Literals.VIEWPOINT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.VIEWPOINT__FRAMES:
				return getFrames();
			case EnterprisePackage.VIEWPOINT__GOVERNS:
				return getGoverns();
			case EnterprisePackage.VIEWPOINT__DOMAINS:
				return getDomains();
			case EnterprisePackage.VIEWPOINT__REPRESENTATIONS:
				return getRepresentations();
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
			case EnterprisePackage.VIEWPOINT__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends Concern>)newValue);
				return;
			case EnterprisePackage.VIEWPOINT__GOVERNS:
				getGoverns().clear();
				getGoverns().addAll((Collection<? extends View>)newValue);
				return;
			case EnterprisePackage.VIEWPOINT__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends SemanticDomainKind>)newValue);
				return;
			case EnterprisePackage.VIEWPOINT__REPRESENTATIONS:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends RepresentationKind>)newValue);
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
			case EnterprisePackage.VIEWPOINT__FRAMES:
				getFrames().clear();
				return;
			case EnterprisePackage.VIEWPOINT__GOVERNS:
				getGoverns().clear();
				return;
			case EnterprisePackage.VIEWPOINT__DOMAINS:
				getDomains().clear();
				return;
			case EnterprisePackage.VIEWPOINT__REPRESENTATIONS:
				getRepresentations().clear();
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
			case EnterprisePackage.VIEWPOINT__FRAMES:
				return !getFrames().isEmpty();
			case EnterprisePackage.VIEWPOINT__GOVERNS:
				return !getGoverns().isEmpty();
			case EnterprisePackage.VIEWPOINT__DOMAINS:
				return !getDomains().isEmpty();
			case EnterprisePackage.VIEWPOINT__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewpointImpl
