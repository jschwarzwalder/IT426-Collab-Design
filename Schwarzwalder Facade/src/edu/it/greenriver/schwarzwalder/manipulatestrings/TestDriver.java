/**
 * Jami Schwarzwalder
 * Oct 22, 2016
 * TestDriver.java
 * Tests the StringOperations, StringParsing, and StringRegex classes
 */
package edu.it.greenriver.schwarzwalder.manipulatestrings;

import java.util.Arrays;

/**
 * Tests the StringOperations, StringParsing, and StringRegex classes
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public abstract class TestDriver {

	/**
	 * Tests the StringOperations, StringParsing, and StringRegex classes
	 * 
	 * @param args command line arguments.  These are ignored.
	 */
	public static void main(String[] args) {
		String[] testArray = new String[]{"T", "e", "s", "t", " ",
				                          "a", "r", "r", "a", "y"};
		String[] emptyArray = new String[0];
		String[] secondTestArray = new String[]{"Second", "Test", "Array"};
		
		testRemoveDuplicates(testArray);
		testRemoveDuplicates(emptyArray);
		testRemoveDuplicates(secondTestArray);
		
		testResize(testArray, 4);
		testResize(secondTestArray, 10);
		testResize(emptyArray, 5);
		
		testFilter(testArray, "a");
		testFilter(testArray, "x");
		testFilter(testArray, "");
		testFilter(emptyArray, "5");
		testFilter(secondTestArray, "Second");
		
		
		String emailAddress = "fake@gmail.com";
		String zipCode = "12345";
		String longZipCode = "12345-6789";
		String phoneNumberWithDashes = "123-456-7890";
		String phoneNumber = "1234567890";
		String insecureUrl = "http://google.com";
		String secureUrl = "https://egator.greenriver.edu";
		
		testBefore(emailAddress, "@");
		testBefore(zipCode, "-");
		testBefore(insecureUrl, ".com");
		testBefore(secureUrl, "https://");
		testBefore("", "Something");

		testAfter(emailAddress, "@");
		testAfter(zipCode, "-");
		testAfter(insecureUrl, ".com");
		testAfter(secureUrl, "https://");
		testAfter("", "Something");

		testValidation(emailAddress);
		testValidation(zipCode);
		testValidation(longZipCode);
		testValidation(phoneNumberWithDashes);
		testValidation(phoneNumber);
		testValidation(insecureUrl);
		testValidation(secureUrl);
		testValidation("");
		testValidation("akdvjasketj");
		
	}
	
	private static void testValidation(String subject)
	{
		printSeparator();
		System.out.println("validating \"" + subject + "\"...");
		System.out.print("Email: ");
		System.out.println(StringRegex.isEmail(subject));
		System.out.print("ZIP Code: ");
		System.out.println(StringRegex.isZipCode(subject));
		System.out.print("Phone Number: ");
		System.out.println(StringRegex.isPhoneNumber(subject));
		System.out.print("URL: ");
		System.out.println(StringRegex.isUrl(subject));
	}

	private static void testAfter(String subject, String delimiter)
	{
		printSeparator();
		System.out.println(">StringParsing.after(\"" + subject + "\", \"" + delimiter +"\");");
		System.out.println("\"" + StringParsing.after(subject, delimiter) + "\"");
	}

	private static void testBefore(String subject, String delimiter)
	{
		printSeparator();
		System.out.println(">StringParsing.before(\"" + subject + "\", \"" + delimiter +"\");");
		System.out.println("\"" + StringParsing.before(subject, delimiter) + "\"");
	}
	
	private static void testFilter(String[] array, String search)
	{
		printSeparator();
		System.out.println(Arrays.toString(array));
		System.out.println("Removing all instances of \"" + search + "\"...");
		String[] filtered = StringOperations.filter(array, search);
		System.out.println(Arrays.toString(filtered));
	}
	
	private static void testResize(String[] array, int newLength)
	{
		printSeparator();
		System.out.println(Arrays.toString(array));
		System.out.println("Changing Size to " + newLength + "...");
		String[] resized = StringOperations.resize(array, newLength);
		System.out.println(Arrays.toString(resized));
	}

	private static void testRemoveDuplicates(String[] array) {
		printSeparator();
		System.out.println(Arrays.toString(array));
		System.out.println("Removing Duplicates...");
		String[] removedDuplicates = StringOperations.removeDuplicates(array);
		System.out.println(Arrays.toString(removedDuplicates));
	}

	private static void printSeparator() {
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	

}
