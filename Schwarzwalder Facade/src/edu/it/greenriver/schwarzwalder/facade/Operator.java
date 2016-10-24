/**
 * Jami Schwarzwalder
 * Oct 23, 2016
 * Operator.java
 * Operator uses a technique called method chaining to perform String operations
 */
package edu.it.greenriver.schwarzwalder.facade;

import edu.it.greenriver.schwarzwalder.manipulatestrings.StringOperations;

/**
 * Operator uses a technique called method chaining to perform String operations
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class Operator {
	private String[] subject;

	/**
	 * Creates a new Operator
	 *
	 */
	public Operator(String[] subject) {
		this.subject = subject;
	}

	/**
	 * Gets the subject
	 *
	 * @return the subject
	 */
	public String[] getSubject() {
		return subject;
	}

	/**
	 * This method removes all instances of search from the subject field
	 *
	 * @param search the string to remove
	 * @return a new Operator object with the result of the filter operation 
	 * 
	 */
	public Operator filter(String search) {
		return new Operator(StringOperations.filter(subject, search));
	}

	
	/**
	 * This method removes all duplicates from the subject field 
	 *
	 * @return a new Operator object with the result of the remove duplicates operation 
	 * 
	 */
	public Operator removeDuplicates() {
		return new Operator(StringOperations.removeDuplicates(subject));
		
	}
	
	/**
	 * This method resizes the subject field
	 *
	 * @param lengththe length of the new array
	 * @return a new Operator object with the result of the resize operation 
	 *  
	 */
	public Operator resize(int length) {
		return new Operator(StringOperations.resize(subject, length));
		
	}
}
