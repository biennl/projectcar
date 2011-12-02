/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Date Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage#getDateFormat()
 * @model
 * @generated
 */
public enum DateFormat implements Enumerator {
	/**
	 * The '<em><b>Day Month Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_MONTH_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_MONTH_YEAR(0, "DayMonthYear", "ddmmyyyy"),

	/**
	 * The '<em><b>Year Month Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR_MONTH_DAY(1, "YearMonthDay", "yyyymmdd");

	/**
	 * The '<em><b>Day Month Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day Month Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_MONTH_YEAR
	 * @model name="DayMonthYear" literal="ddmmyyyy"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_MONTH_YEAR_VALUE = 0;

	/**
	 * The '<em><b>Year Month Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year Month Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH_DAY
	 * @model name="YearMonthDay" literal="yyyymmdd"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_MONTH_DAY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Date Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateFormat[] VALUES_ARRAY =
		new DateFormat[] {
			DAY_MONTH_YEAR,
			YEAR_MONTH_DAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Date Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateFormat get(int value) {
		switch (value) {
			case DAY_MONTH_YEAR_VALUE: return DAY_MONTH_YEAR;
			case YEAR_MONTH_DAY_VALUE: return YEAR_MONTH_DAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DateFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DateFormat
