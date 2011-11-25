/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import webapp.Control;
import webapp.FormPage;
import webapp.NormalPage;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.FormPageImpl#getSuccessTarget <em>Success Target</em>}</li>
 *   <li>{@link webapp.impl.FormPageImpl#getErrorTarget <em>Error Target</em>}</li>
 *   <li>{@link webapp.impl.FormPageImpl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormPageImpl extends PageImpl implements FormPage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.FORM_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPage getSuccessTarget() {
		return (NormalPage)eGet(WebappPackage.Literals.FORM_PAGE__SUCCESS_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessTarget(NormalPage newSuccessTarget) {
		eSet(WebappPackage.Literals.FORM_PAGE__SUCCESS_TARGET, newSuccessTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPage getErrorTarget() {
		return (NormalPage)eGet(WebappPackage.Literals.FORM_PAGE__ERROR_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorTarget(NormalPage newErrorTarget) {
		eSet(WebappPackage.Literals.FORM_PAGE__ERROR_TARGET, newErrorTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Control> getControls() {
		return (EList<Control>)eGet(WebappPackage.Literals.FORM_PAGE__CONTROLS, true);
	}

} //FormPageImpl
