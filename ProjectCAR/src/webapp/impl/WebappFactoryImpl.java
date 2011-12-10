/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webapp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebappFactoryImpl extends EFactoryImpl implements WebappFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebappFactory init() {
		try {
			WebappFactory theWebappFactory = (WebappFactory)EPackage.Registry.INSTANCE.getEFactory("http://webapp/1.0"); 
			if (theWebappFactory != null) {
				return theWebappFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebappFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebappPackage.FORM_PAGE: return (EObject)createFormPage();
			case WebappPackage.NORMAL_PAGE: return (EObject)createNormalPage();
			case WebappPackage.LABEL: return (EObject)createLabel();
			case WebappPackage.LINK: return (EObject)createLink();
			case WebappPackage.TEXT_BOX: return (EObject)createTextBox();
			case WebappPackage.DROP_DOWN_LIST: return (EObject)createDropDownList();
			case WebappPackage.LIST_ELEMENT: return (EObject)createListElement();
			case WebappPackage.RADIO_BUTTON: return (EObject)createRadioButton();
			case WebappPackage.CHECK_BOX: return (EObject)createCheckBox();
			case WebappPackage.DYNAMIC_WEB_APP: return (EObject)createDynamicWebApp();
			case WebappPackage.RESET_BUTTON: return (EObject)createResetButton();
			case WebappPackage.NORMAL_BUTTON: return (EObject)createNormalButton();
			case WebappPackage.PASSWORD_BOX: return (EObject)createPasswordBox();
			case WebappPackage.EMAIL_BOX: return (EObject)createEmailBox();
			case WebappPackage.DATE_BOX: return (EObject)createDateBox();
			case WebappPackage.SUBMIT_BUTTON: return (EObject)createSubmitButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebappPackage.DATE_FORMAT:
				return createDateFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebappPackage.DATE_FORMAT:
				return convertDateFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormPage createFormPage() {
		FormPageImpl formPage = new FormPageImpl();
		return formPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPage createNormalPage() {
		NormalPageImpl normalPage = new NormalPageImpl();
		return normalPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitButton createSubmitButton() {
		SubmitButtonImpl submitButton = new SubmitButtonImpl();
		return submitButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBox createTextBox() {
		TextBoxImpl textBox = new TextBoxImpl();
		return textBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDownList createDropDownList() {
		DropDownListImpl dropDownList = new DropDownListImpl();
		return dropDownList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListElement createListElement() {
		ListElementImpl listElement = new ListElementImpl();
		return listElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWebApp createDynamicWebApp() {
		DynamicWebAppImpl dynamicWebApp = new DynamicWebAppImpl();
		return dynamicWebApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetButton createResetButton() {
		ResetButtonImpl resetButton = new ResetButtonImpl();
		return resetButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalButton createNormalButton() {
		NormalButtonImpl normalButton = new NormalButtonImpl();
		return normalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordBox createPasswordBox() {
		PasswordBoxImpl passwordBox = new PasswordBoxImpl();
		return passwordBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailBox createEmailBox() {
		EmailBoxImpl emailBox = new EmailBoxImpl();
		return emailBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateBox createDateBox() {
		DateBoxImpl dateBox = new DateBoxImpl();
		return dateBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat createDateFormatFromString(EDataType eDataType, String initialValue) {
		DateFormat result = DateFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappPackage getWebappPackage() {
		return (WebappPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebappPackage getPackage() {
		return WebappPackage.eINSTANCE;
	}

} //WebappFactoryImpl
