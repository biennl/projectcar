/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp.impl;

import org.eclipse.emf.ecore.EClass;

import webapp.DateBox;
import webapp.DateFormat;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.DateBoxImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateBoxImpl extends TextBoxImpl implements DateBox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.DATE_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat getFormat() {
		return (DateFormat)eGet(WebappPackage.Literals.DATE_BOX__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(DateFormat newFormat) {
		eSet(WebappPackage.Literals.DATE_BOX__FORMAT, newFormat);
	}

} //DateBoxImpl
