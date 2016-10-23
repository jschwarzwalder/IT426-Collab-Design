/**
 * Jami Schwarzwalder
 * Oct 22, 2016
 * StringOperations.java
 * Performs arbitrary operations on String arrays
 */
package edu.it.greenriver.schwarzwalder.manipulatestrings;

import java.util.HashSet;

/**
 * Performs arbitrary operations on String arrays
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public abstract class StringOperations {

	/**
	 * Removes duplicates from the given array
	 * 
	 * @param values
	 *            the array from which duplicates should be removed
	 * @return a copy of values with all duplicates removed
	 */
	public static String[] removeDuplicates(String[] values) {
		// Put into set to remove duplicates
		HashSet<String> valueSet = new HashSet<String>();
		for (String value : values) {
			valueSet.add(value);
		}

		// put into a new array to maintain the original order
		String[] result = new String[valueSet.size()];
		int resultIndex = 0;
		for (String value : values) {
			if (valueSet.contains(value)) {
				result[resultIndex] = value;
				valueSet.remove(value);
				resultIndex++;
			}
		}
		return result;
	}

	/**
	 * Copies the given array to a new array of the given length
	 * 
	 * @param values
	 *            the array to be copied
	 * @param newLength
	 *            the length of the new array
	 * @return an array of the given length containing as many values from the
	 *         given array as will fit
	 */
	public static String[] resize(String[] values, int newLength) {
		String[] result = new String[newLength];
		for (int i = 0; i < values.length && i < result.length; i++) {
			result[i] = values[i];
		}
		return result;
	}

	/**
	 * Removes all instances of the given search value from the given string
	 * array
	 * 
	 * @param values
	 *            the array to be searched
	 * @param search
	 *            the value to search for
	 * @return a copy of the array with all copies of the search value removed
	 */
	public static String[] filter(String[] values, String search) {
		// Count matches
		int numMatches = 0;
		for (String value : values) {
			if (value.equals(search)) {
				numMatches++;
			}
		}

		// populate result array
		String[] result = new String[values.length - numMatches];
		int resultIndex = 0;
		for (String value : values) {
			if (!value.equals(search)) {
				result[resultIndex] = value;
				resultIndex++;
			}
		}

		return result;
	}
}
