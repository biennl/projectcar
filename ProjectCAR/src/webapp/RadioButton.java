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
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.RadioButton#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends Control {
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
	 * @see webapp.WebappPackage#getRadioButton_Elements()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ListElement> getElements();

} // RadioButton
