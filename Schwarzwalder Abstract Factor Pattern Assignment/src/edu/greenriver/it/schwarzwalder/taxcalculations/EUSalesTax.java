/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * EUSalesTax.java
 * Calculates tax in Europe
 */
package edu.greenriver.it.schwarzwalder.taxcalculations;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class EUSalesTax implements ISalesTax {

	/**
	 * Handles tax calculations 
	 * based on region 
	 * 
	 * @param salesSubTotal
	 * @return calculated sales tax
	 */
	@Override
	public double calculateTax(double salesSubTotal) {
		
		return 0;
	}

}
