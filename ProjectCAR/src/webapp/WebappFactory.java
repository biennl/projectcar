/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public interface WebappFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebappFactory eINSTANCE = webapp.impl.WebappFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Form Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Page</em>'.
	 * @generated
	 */
	FormPage createFormPage();

	/**
	 * Returns a new object of class '<em>Normal Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Page</em>'.
	 * @generated
	 */
	NormalPage createNormalPage();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Submit Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Button</em>'.
	 * @generated
	 */
	SubmitButton createSubmitButton();

	/**
	 * Returns a new object of class '<em>Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Box</em>'.
	 * @generated
	 */
	TextBox createTextBox();

	/**
	 * Returns a new object of class '<em>Drop Down List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Down List</em>'.
	 * @generated
	 */
	DropDownList createDropDownList();

	/**
	 * Returns a new object of class '<em>List Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Element</em>'.
	 * @generated
	 */
	ListElement createListElement();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Dynamic Web App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Web App</em>'.
	 * @generated
	 */
	DynamicWebApp createDynamicWebApp();

	/**
	 * Returns a new object of class '<em>Reset Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Button</em>'.
	 * @generated
	 */
	ResetButton createResetButton();

	/**
	 * Returns a new object of class '<em>Normal Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Button</em>'.
	 * @generated
	 */
	NormalButton createNormalButton();

	/**
	 * Returns a new object of class '<em>Password Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password Box</em>'.
	 * @generated
	 */
	PasswordBox createPasswordBox();

	/**
	 * Returns a new object of class '<em>Email Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Box</em>'.
	 * @generated
	 */
	EmailBox createEmailBox();

	/**
	 * Returns a new object of class '<em>Date Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Box</em>'.
	 * @generated
	 */
	DateBox createDateBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebappPackage getWebappPackage();

} //WebappFactory
