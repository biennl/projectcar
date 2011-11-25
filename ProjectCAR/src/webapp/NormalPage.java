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
 * A representation of the model object '<em><b>Normal Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.NormalPage#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getNormalPage()
 * @model
 * @generated
 */
public interface NormalPage extends Page {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.NormalControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see webapp.WebappPackage#getNormalPage_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalControl> getControls();

} // NormalPage
