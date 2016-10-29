/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * ISalesTax.java
 * Interface for the collection of sales tax
 */
package edu.greenriver.it.schwarzwalder.taxcalculations;

/**
 * Interface for the collection of sales tax
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface ISalesTax {
	
	/**
	 * Handles tax calculations 
	 * 
	 * @param salesSubTotal
	 * @return calculated sales tax
	 */
	public double calculateTax(double salesSubTotal);

}
