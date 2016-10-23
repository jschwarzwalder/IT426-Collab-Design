/**
 * Jami Schwarzwalder
 * Oct 22, 2016
 * StringParsing.java
 * A wrapper for String.split with a limit of 2
 */
package edu.it.greenriver.schwarzwalder.manipulatestrings;

/**
 * A wrapper for String.split with a limit of 2
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class StringParsing {

	/**
	 * Returns all characters in subject from the start of the string up to the
	 * first occurrence of delimiter
	 * 
	 * @param subject
	 *            The string the split
	 * @param delimiter
	 *            The pattern to split the string around
	 * @return the part of subject before the first occurrence of the delimiter
	 */
	public static String before(String subject, String delimiter) {
		return subject.split(delimiter, 2)[0];
	}

	/**
	 * Returns all characters in subject from the first occurrence of delimiter
	 * to the end of the subject string
	 * 
	 * @param subject
	 *            The string the split
	 * @param delimiter
	 *            The pattern to split the string around
	 * @return the part of subject after the first occurrence of the delimiter
	 */
	public static String after(String subject, String delimiter) {
		String[] splitString = subject.split(delimiter, 2);
		if (splitString.length < 2) {
			return subject;
		} else {
			return splitString[1];
		}
	}
}
