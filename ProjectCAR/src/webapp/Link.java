/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Link#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Control, NormalControl {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Page)
	 * @see webapp.WebappPackage#getLink_Destination()
	 * @model required="true"
	 * @generated
	 */
	Page getDestination();

	/**
	 * Sets the value of the '{@link webapp.Link#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Page value);

} // Link
