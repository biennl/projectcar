/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import webapp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public class WebappAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebappPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebappPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebappSwitch<Adapter> modelSwitch =
		new WebappSwitch<Adapter>() {
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseFormPage(FormPage object) {
				return createFormPageAdapter();
			}
			@Override
			public Adapter caseNormalPage(NormalPage object) {
				return createNormalPageAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseSubmitButton(SubmitButton object) {
				return createSubmitButtonAdapter();
			}
			@Override
			public Adapter caseTextBox(TextBox object) {
				return createTextBoxAdapter();
			}
			@Override
			public Adapter caseDropDownList(DropDownList object) {
				return createDropDownListAdapter();
			}
			@Override
			public Adapter caseListElement(ListElement object) {
				return createListElementAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseNormalControl(NormalControl object) {
				return createNormalControlAdapter();
			}
			@Override
			public Adapter caseDynamicWebApp(DynamicWebApp object) {
				return createDynamicWebAppAdapter();
			}
			@Override
			public Adapter caseFormButton(FormButton object) {
				return createFormButtonAdapter();
			}
			@Override
			public Adapter caseResetButton(ResetButton object) {
				return createResetButtonAdapter();
			}
			@Override
			public Adapter caseNormalButton(NormalButton object) {
				return createNormalButtonAdapter();
			}
			@Override
			public Adapter casePasswordBox(PasswordBox object) {
				return createPasswordBoxAdapter();
			}
			@Override
			public Adapter caseEmailBox(EmailBox object) {
				return createEmailBoxAdapter();
			}
			@Override
			public Adapter caseDateBox(DateBox object) {
				return createDateBoxAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link webapp.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.FormPage <em>Form Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.FormPage
	 * @generated
	 */
	public Adapter createFormPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.NormalPage <em>Normal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.NormalPage
	 * @generated
	 */
	public Adapter createNormalPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.SubmitButton
	 * @generated
	 */
	public Adapter createSubmitButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.TextBox
	 * @generated
	 */
	public Adapter createTextBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.DropDownList <em>Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.DropDownList
	 * @generated
	 */
	public Adapter createDropDownListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.NormalControl <em>Normal Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.NormalControl
	 * @generated
	 */
	public Adapter createNormalControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.DynamicWebApp <em>Dynamic Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.DynamicWebApp
	 * @generated
	 */
	public Adapter createDynamicWebAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.FormButton <em>Form Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.FormButton
	 * @generated
	 */
	public Adapter createFormButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.ResetButton
	 * @generated
	 */
	public Adapter createResetButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.NormalButton <em>Normal Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.NormalButton
	 * @generated
	 */
	public Adapter createNormalButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.PasswordBox <em>Password Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.PasswordBox
	 * @generated
	 */
	public Adapter createPasswordBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.EmailBox <em>Email Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.EmailBox
	 * @generated
	 */
	public Adapter createEmailBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.DateBox <em>Date Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.DateBox
	 * @generated
	 */
	public Adapter createDateBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebappAdapterFactory
