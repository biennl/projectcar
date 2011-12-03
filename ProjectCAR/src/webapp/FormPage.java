/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.FormPage#getSuccessTarget <em>Success Target</em>}</li>
 *   <li>{@link webapp.FormPage#getErrorTarget <em>Error Target</em>}</li>
 *   <li>{@link webapp.FormPage#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getFormPage()
 * @model
 * @generated
 */
public interface FormPage extends Page {
	/**
	 * Returns the value of the '<em><b>Success Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Target</em>' reference.
	 * @see #setSuccessTarget(Page)
	 * @see webapp.WebappPackage#getFormPage_SuccessTarget()
	 * @model
	 * @generated
	 */
	Page getSuccessTarget();

	/**
	 * Sets the value of the '{@link webapp.FormPage#getSuccessTarget <em>Success Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Target</em>' reference.
	 * @see #getSuccessTarget()
	 * @generated
	 */
	void setSuccessTarget(Page value);

	/**
	 * Returns the value of the '<em><b>Error Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Target</em>' reference.
	 * @see #setErrorTarget(Page)
	 * @see webapp.WebappPackage#getFormPage_ErrorTarget()
	 * @model
	 * @generated
	 */
	Page getErrorTarget();

	/**
	 * Sets the value of the '{@link webapp.FormPage#getErrorTarget <em>Error Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Target</em>' reference.
	 * @see #getErrorTarget()
	 * @generated
	 */
	void setErrorTarget(Page value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see webapp.WebappPackage#getFormPage_Controls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Control> getControls();

} // FormPage
