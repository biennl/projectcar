/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.DateBox#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getDateBox()
 * @model
 * @generated
 */
public interface DateBox extends TextBox {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.DateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see webapp.DateFormat
	 * @see #setFormat(DateFormat)
	 * @see webapp.WebappPackage#getDateBox_Format()
	 * @model
	 * @generated
	 */
	DateFormat getFormat();

	/**
	 * Sets the value of the '{@link webapp.DateBox#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see webapp.DateFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(DateFormat value);

} // DateBox
