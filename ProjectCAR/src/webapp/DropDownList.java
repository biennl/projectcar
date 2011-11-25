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
 * A representation of the model object '<em><b>Drop Down List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.DropDownList#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getDropDownList()
 * @model
 * @generated
 */
public interface DropDownList extends Control {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.ListElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see webapp.WebappPackage#getDropDownList_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListElement> getElements();

} // DropDownList
