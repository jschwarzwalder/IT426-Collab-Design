/**
 * Jami Schwarzwalder
 * Oct 23, 2016
 * FacadeTestDriver.java
 * Tests the Facade and Operator classes
 */
package edu.it.greenriver.schwarzwalder.facade;

import java.util.Arrays;

/**
 * Tests the Facade and Operator classes
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class FacadeTestDriver {

	/**
	 * Tests the Facade and Operator classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Checking emails...");
		String[] emailsToValidate = new String[] 
				{"my_email@gmail.com", "e@e.com", "catch@22@.msn.com", "j@q.com", "99999"};
		for (int i = 0; i < emailsToValidate.length; i++){
			System.out.print(emailsToValidate[i] + ": ");
			boolean isValid = Facade.validate(ValidationType.EMAIL, emailsToValidate[i]);
			System.out.println(isValid);
		}
		
		System.out.println("\nChecking Zipcodes...");
		String[] zipCodesToValidate = new String[] 
				{"99999", "88888-0000", "9999", "xxxxx", "ABX-392"};
		for (int i = 0; i < zipCodesToValidate.length; i++){
			System.out.print(zipCodesToValidate[i] + ": ");
			boolean isValid = Facade.validate(ValidationType.ZIPCODE, zipCodesToValidate[i]);
			System.out.println(isValid);
		}
		System.out.println("\nOperator Manipulation");
		String[] subjectToTest = new String[] 
				{"blue", "red", "white", "blue", "yellow", "yellow", "", "red", "red"};
		System.out.println("Manipulating this String Array: " + Arrays.toString(subjectToTest));
		System.out.println("removing yellow...");
		System.out.println("reduce size...");
		String[] objectManipulated = Facade.getOperator(subjectToTest).filter("yellow").resize(5).getSubject();
		System.out.println(Arrays.toString(objectManipulated));
		

	}

}
