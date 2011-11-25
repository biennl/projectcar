/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webapp.WebappFactory
 * @model kind="package"
 * @generated
 */
public interface WebappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://webapp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebappPackage eINSTANCE = webapp.impl.WebappPackageImpl.init();

	/**
	 * The meta object id for the '{@link webapp.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.PageImpl
	 * @see webapp.impl.WebappPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DEFAULT = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link webapp.impl.FormPageImpl <em>Form Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.FormPageImpl
	 * @see webapp.impl.WebappPackageImpl#getFormPage()
	 * @generated
	 */
	int FORM_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__DEFAULT = PAGE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Success Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__SUCCESS_TARGET = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__ERROR_TARGET = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE__CONTROLS = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Form Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link webapp.impl.NormalPageImpl <em>Normal Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NormalPageImpl
	 * @see webapp.impl.WebappPackageImpl#getNormalPage()
	 * @generated
	 */
	int NORMAL_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__DEFAULT = PAGE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__CONTROLS = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ControlImpl
	 * @see webapp.impl.WebappPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link webapp.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.LabelImpl
	 * @see webapp.impl.WebappPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.LinkImpl
	 * @see webapp.impl.WebappPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESTINATION = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link webapp.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.SubmitButtonImpl
	 * @see webapp.impl.WebappPackageImpl#getSubmitButton()
	 * @generated
	 */
	int SUBMIT_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Submit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.TextBoxImpl <em>Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TextBoxImpl
	 * @see webapp.impl.WebappPackageImpl#getTextBox()
	 * @generated
	 */
	int TEXT_BOX = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__MAX_LENGTH = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__SIZE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link webapp.impl.DropDownListImpl <em>Drop Down List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DropDownListImpl
	 * @see webapp.impl.WebappPackageImpl#getDropDownList()
	 * @generated
	 */
	int DROP_DOWN_LIST = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__ELEMENTS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Down List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ListElementImpl
	 * @see webapp.impl.WebappPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link webapp.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.RadioButtonImpl
	 * @see webapp.impl.WebappPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__OPTIONS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.CheckBoxImpl
	 * @see webapp.impl.WebappPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.NormalControlImpl <em>Normal Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NormalControlImpl
	 * @see webapp.impl.WebappPackageImpl#getNormalControl()
	 * @generated
	 */
	int NORMAL_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_CONTROL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_CONTROL__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link webapp.impl.DynamicWebAppImpl <em>Dynamic Web App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DynamicWebAppImpl
	 * @see webapp.impl.WebappPackageImpl#getDynamicWebApp()
	 * @generated
	 */
	int DYNAMIC_WEB_APP = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WEB_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WEB_APP__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WEB_APP_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link webapp.impl.FormButtonImpl <em>Form Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.FormButtonImpl
	 * @see webapp.impl.WebappPackageImpl#getFormButton()
	 * @generated
	 */
	int FORM_BUTTON = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link webapp.impl.ResetButtonImpl <em>Reset Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ResetButtonImpl
	 * @see webapp.impl.WebappPackageImpl#getResetButton()
	 * @generated
	 */
	int RESET_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__ID = FORM_BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__NAME = FORM_BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__TEXT = FORM_BUTTON__TEXT;

	/**
	 * The number of structural features of the '<em>Reset Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON_FEATURE_COUNT = FORM_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.NormalButtonImpl <em>Normal Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NormalButtonImpl
	 * @see webapp.impl.WebappPackageImpl#getNormalButton()
	 * @generated
	 */
	int NORMAL_BUTTON = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BUTTON__ID = NORMAL_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BUTTON__NAME = NORMAL_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BUTTON__TEXT = NORMAL_CONTROL__TEXT;

	/**
	 * The number of structural features of the '<em>Normal Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BUTTON_FEATURE_COUNT = NORMAL_CONTROL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link webapp.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see webapp.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see webapp.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Page#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see webapp.Page#isDefault()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Default();

	/**
	 * Returns the meta object for class '{@link webapp.FormPage <em>Form Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Page</em>'.
	 * @see webapp.FormPage
	 * @generated
	 */
	EClass getFormPage();

	/**
	 * Returns the meta object for the reference '{@link webapp.FormPage#getSuccessTarget <em>Success Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Success Target</em>'.
	 * @see webapp.FormPage#getSuccessTarget()
	 * @see #getFormPage()
	 * @generated
	 */
	EReference getFormPage_SuccessTarget();

	/**
	 * Returns the meta object for the reference '{@link webapp.FormPage#getErrorTarget <em>Error Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Target</em>'.
	 * @see webapp.FormPage#getErrorTarget()
	 * @see #getFormPage()
	 * @generated
	 */
	EReference getFormPage_ErrorTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.FormPage#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see webapp.FormPage#getControls()
	 * @see #getFormPage()
	 * @generated
	 */
	EReference getFormPage_Controls();

	/**
	 * Returns the meta object for class '{@link webapp.NormalPage <em>Normal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Page</em>'.
	 * @see webapp.NormalPage
	 * @generated
	 */
	EClass getNormalPage();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.NormalPage#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see webapp.NormalPage#getControls()
	 * @see #getNormalPage()
	 * @generated
	 */
	EReference getNormalPage_Controls();

	/**
	 * Returns the meta object for class '{@link webapp.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see webapp.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Control#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see webapp.Control#getId()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Id();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for class '{@link webapp.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see webapp.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link webapp.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see webapp.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link webapp.Link#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see webapp.Link#getDestination()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Destination();

	/**
	 * Returns the meta object for class '{@link webapp.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Button</em>'.
	 * @see webapp.SubmitButton
	 * @generated
	 */
	EClass getSubmitButton();

	/**
	 * Returns the meta object for class '{@link webapp.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box</em>'.
	 * @see webapp.TextBox
	 * @generated
	 */
	EClass getTextBox();

	/**
	 * Returns the meta object for the attribute '{@link webapp.TextBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webapp.TextBox#getText()
	 * @see #getTextBox()
	 * @generated
	 */
	EAttribute getTextBox_Text();

	/**
	 * Returns the meta object for the attribute '{@link webapp.TextBox#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see webapp.TextBox#getMaxLength()
	 * @see #getTextBox()
	 * @generated
	 */
	EAttribute getTextBox_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link webapp.TextBox#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.TextBox#getSize()
	 * @see #getTextBox()
	 * @generated
	 */
	EAttribute getTextBox_Size();

	/**
	 * Returns the meta object for class '{@link webapp.DropDownList <em>Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Down List</em>'.
	 * @see webapp.DropDownList
	 * @generated
	 */
	EClass getDropDownList();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.DropDownList#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see webapp.DropDownList#getElements()
	 * @see #getDropDownList()
	 * @generated
	 */
	EReference getDropDownList_Elements();

	/**
	 * Returns the meta object for class '{@link webapp.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see webapp.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the attribute '{@link webapp.ListElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see webapp.ListElement#getValue()
	 * @see #getListElement()
	 * @generated
	 */
	EAttribute getListElement_Value();

	/**
	 * Returns the meta object for class '{@link webapp.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see webapp.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.RadioButton#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see webapp.RadioButton#getOptions()
	 * @see #getRadioButton()
	 * @generated
	 */
	EReference getRadioButton_Options();

	/**
	 * Returns the meta object for class '{@link webapp.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see webapp.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link webapp.CheckBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webapp.CheckBox#getText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Text();

	/**
	 * Returns the meta object for class '{@link webapp.NormalControl <em>Normal Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Control</em>'.
	 * @see webapp.NormalControl
	 * @generated
	 */
	EClass getNormalControl();

	/**
	 * Returns the meta object for the attribute '{@link webapp.NormalControl#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webapp.NormalControl#getText()
	 * @see #getNormalControl()
	 * @generated
	 */
	EAttribute getNormalControl_Text();

	/**
	 * Returns the meta object for class '{@link webapp.DynamicWebApp <em>Dynamic Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Web App</em>'.
	 * @see webapp.DynamicWebApp
	 * @generated
	 */
	EClass getDynamicWebApp();

	/**
	 * Returns the meta object for the attribute '{@link webapp.DynamicWebApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.DynamicWebApp#getName()
	 * @see #getDynamicWebApp()
	 * @generated
	 */
	EAttribute getDynamicWebApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.DynamicWebApp#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see webapp.DynamicWebApp#getPages()
	 * @see #getDynamicWebApp()
	 * @generated
	 */
	EReference getDynamicWebApp_Pages();

	/**
	 * Returns the meta object for class '{@link webapp.FormButton <em>Form Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Button</em>'.
	 * @see webapp.FormButton
	 * @generated
	 */
	EClass getFormButton();

	/**
	 * Returns the meta object for the attribute '{@link webapp.FormButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webapp.FormButton#getText()
	 * @see #getFormButton()
	 * @generated
	 */
	EAttribute getFormButton_Text();

	/**
	 * Returns the meta object for class '{@link webapp.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Button</em>'.
	 * @see webapp.ResetButton
	 * @generated
	 */
	EClass getResetButton();

	/**
	 * Returns the meta object for class '{@link webapp.NormalButton <em>Normal Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Button</em>'.
	 * @see webapp.NormalButton
	 * @generated
	 */
	EClass getNormalButton();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebappFactory getWebappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webapp.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.PageImpl
		 * @see webapp.impl.WebappPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DEFAULT = eINSTANCE.getPage_Default();

		/**
		 * The meta object literal for the '{@link webapp.impl.FormPageImpl <em>Form Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.FormPageImpl
		 * @see webapp.impl.WebappPackageImpl#getFormPage()
		 * @generated
		 */
		EClass FORM_PAGE = eINSTANCE.getFormPage();

		/**
		 * The meta object literal for the '<em><b>Success Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PAGE__SUCCESS_TARGET = eINSTANCE.getFormPage_SuccessTarget();

		/**
		 * The meta object literal for the '<em><b>Error Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PAGE__ERROR_TARGET = eINSTANCE.getFormPage_ErrorTarget();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PAGE__CONTROLS = eINSTANCE.getFormPage_Controls();

		/**
		 * The meta object literal for the '{@link webapp.impl.NormalPageImpl <em>Normal Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NormalPageImpl
		 * @see webapp.impl.WebappPackageImpl#getNormalPage()
		 * @generated
		 */
		EClass NORMAL_PAGE = eINSTANCE.getNormalPage();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_PAGE__CONTROLS = eINSTANCE.getNormalPage_Controls();

		/**
		 * The meta object literal for the '{@link webapp.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ControlImpl
		 * @see webapp.impl.WebappPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__ID = eINSTANCE.getControl_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '{@link webapp.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.LabelImpl
		 * @see webapp.impl.WebappPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link webapp.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.LinkImpl
		 * @see webapp.impl.WebappPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DESTINATION = eINSTANCE.getLink_Destination();

		/**
		 * The meta object literal for the '{@link webapp.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.SubmitButtonImpl
		 * @see webapp.impl.WebappPackageImpl#getSubmitButton()
		 * @generated
		 */
		EClass SUBMIT_BUTTON = eINSTANCE.getSubmitButton();

		/**
		 * The meta object literal for the '{@link webapp.impl.TextBoxImpl <em>Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TextBoxImpl
		 * @see webapp.impl.WebappPackageImpl#getTextBox()
		 * @generated
		 */
		EClass TEXT_BOX = eINSTANCE.getTextBox();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BOX__TEXT = eINSTANCE.getTextBox_Text();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BOX__MAX_LENGTH = eINSTANCE.getTextBox_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BOX__SIZE = eINSTANCE.getTextBox_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.DropDownListImpl <em>Drop Down List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DropDownListImpl
		 * @see webapp.impl.WebappPackageImpl#getDropDownList()
		 * @generated
		 */
		EClass DROP_DOWN_LIST = eINSTANCE.getDropDownList();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_DOWN_LIST__ELEMENTS = eINSTANCE.getDropDownList_Elements();

		/**
		 * The meta object literal for the '{@link webapp.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ListElementImpl
		 * @see webapp.impl.WebappPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ELEMENT__VALUE = eINSTANCE.getListElement_Value();

		/**
		 * The meta object literal for the '{@link webapp.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.RadioButtonImpl
		 * @see webapp.impl.WebappPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_BUTTON__OPTIONS = eINSTANCE.getRadioButton_Options();

		/**
		 * The meta object literal for the '{@link webapp.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.CheckBoxImpl
		 * @see webapp.impl.WebappPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__TEXT = eINSTANCE.getCheckBox_Text();

		/**
		 * The meta object literal for the '{@link webapp.impl.NormalControlImpl <em>Normal Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NormalControlImpl
		 * @see webapp.impl.WebappPackageImpl#getNormalControl()
		 * @generated
		 */
		EClass NORMAL_CONTROL = eINSTANCE.getNormalControl();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_CONTROL__TEXT = eINSTANCE.getNormalControl_Text();

		/**
		 * The meta object literal for the '{@link webapp.impl.DynamicWebAppImpl <em>Dynamic Web App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DynamicWebAppImpl
		 * @see webapp.impl.WebappPackageImpl#getDynamicWebApp()
		 * @generated
		 */
		EClass DYNAMIC_WEB_APP = eINSTANCE.getDynamicWebApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_WEB_APP__NAME = eINSTANCE.getDynamicWebApp_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_WEB_APP__PAGES = eINSTANCE.getDynamicWebApp_Pages();

		/**
		 * The meta object literal for the '{@link webapp.impl.FormButtonImpl <em>Form Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.FormButtonImpl
		 * @see webapp.impl.WebappPackageImpl#getFormButton()
		 * @generated
		 */
		EClass FORM_BUTTON = eINSTANCE.getFormButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_BUTTON__TEXT = eINSTANCE.getFormButton_Text();

		/**
		 * The meta object literal for the '{@link webapp.impl.ResetButtonImpl <em>Reset Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ResetButtonImpl
		 * @see webapp.impl.WebappPackageImpl#getResetButton()
		 * @generated
		 */
		EClass RESET_BUTTON = eINSTANCE.getResetButton();

		/**
		 * The meta object literal for the '{@link webapp.impl.NormalButtonImpl <em>Normal Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NormalButtonImpl
		 * @see webapp.impl.WebappPackageImpl#getNormalButton()
		 * @generated
		 */
		EClass NORMAL_BUTTON = eINSTANCE.getNormalButton();

	}

} //WebappPackage
