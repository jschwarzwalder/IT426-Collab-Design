/**
 * Jami Schwarzwalder
 * Oct 22, 2016
 * TestDriver.java
 * Provides a unified interface for string operations. 
 */
package edu.it.greenriver.schwarzwalder.facade;

import edu.it.greenriver.schwarzwalder.manipulatestrings.StringOperations;
import edu.it.greenriver.schwarzwalder.manipulatestrings.StringRegex;

/**
 * Provides a unified interface for string operations. 
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class Facade {
	
	/**
	 * This method can be used to validate any of the types from our previous class
	 * ValidateType is used to pick the type of validation
	 * 
	 * return whether subject is of given Validation Type
	 */
	public static boolean validate (ValidationType type, String subject) {
		
		if (type == ValidationType.EMAIL){
			return StringRegex.isEmail(subject);
		} else if (type == ValidationType.ZIPCODE){
			return StringRegex.isZipCode(subject);
		} else if (type == ValidationType.PHONE_NUMBER){
			return StringRegex.isPhoneNumber(subject);
		} else if(type == ValidationType.URL){
			return StringRegex.isUrl(subject);
		} else {
			return false;
		}
		
		
		
	}
	
	public static Operator getOperator(String[] subject){
		return new Operator(subject);
	}
}
