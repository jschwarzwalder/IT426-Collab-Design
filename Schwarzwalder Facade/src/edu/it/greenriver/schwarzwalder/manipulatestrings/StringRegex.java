/**
 * Jami Schwarzwalder
 * Oct 22, 2016
 * StringRegex.java
 * Uses regular expressions to validate the format of Strings
 */
package edu.it.greenriver.schwarzwalder.manipulatestrings;

/**
 * Uses regular expressions to validate the format of Strings
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class StringRegex {

	/**
	 * Returns true if the subject is a valid email address
	 * 
	 * @param subject the string to be checked
	 * @return true if the subject is a valid email address, false otherwise
	 */
	public static boolean isEmail(String subject){
		return subject.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");
	}

	/**
	 * Returns true if the subject is either of the following formats: 88888 or 88888-7777
	 * 
	 * @param subject the string to be checked
	 * @return true if the subject is a valid ZIP code, false otherwise
	 */
	public static boolean isZipCode(String subject){
		return subject.matches("^\\d{5}(-\\d{4})?$");
	}

	/**
	 * Returns true if the subject is either of the following formats: 999-888-7777 or 9998887777
	 * 
	 * @param subject the string to be checked
	 * @return true if the subject is a valid phone number, false otherwise
	 */
	public static boolean isPhoneNumber(String subject){
		return subject.matches("^(\\d{3}-?\\d{3}-?\\d{4})$");
	}

	/**
	 * Returns true if the subject is a valid URL
	 * 
	 * @param subject the string to be checked
	 * @return true if the subject is a valid URL, false otherwise
	 */
	public static boolean isUrl(String subject){
		return subject.matches("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$");
	}
}
