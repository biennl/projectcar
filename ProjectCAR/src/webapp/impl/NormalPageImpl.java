/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import webapp.NormalControl;
import webapp.NormalPage;
import webapp.Page;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.NormalPageImpl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalPageImpl extends PageImpl implements NormalPage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.NORMAL_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NormalControl> getControls() {
		return (EList<NormalControl>)eGet(WebappPackage.Literals.NORMAL_PAGE__CONTROLS, true);
	}

} //NormalPageImpl
