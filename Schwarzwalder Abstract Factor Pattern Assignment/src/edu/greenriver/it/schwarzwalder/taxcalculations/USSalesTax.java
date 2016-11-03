/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * USSalesTax.java
 * Calculates tax in US
 */
package edu.greenriver.it.schwarzwalder.taxcalculations;

/**
 * Calculates tax in US
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class USSalesTax implements ISalesTax {

	private int zipcode;
	
	
	
	/**
	 * Creates a new USSalesTax
	 *
	 * @param zipcode shipment destination
	 */
	public USSalesTax(int zipcode) {
		this.zipcode = zipcode;
	}



	/**
	 * Handles tax calculations 
	 * based on zipcode
	 * 
	 * @param salesSubTotal
	 * @return calculated sales tax
	 */
	@Override
	public double calculateTax(double salesSubTotal) {
		
		if (zipcode > 97000 & zipcode < 97999 ) {
			//Oregon
			return 0;
		} else if ( zipcode > 99500 & zipcode < 100000 ) {
			//Alaska
			return 0;
		} else if (zipcode > 59000 & zipcode < 60000){
			//Montana
			return 0;
		} else if (zipcode > 3000 & zipcode < 3900){
			//New Hampshire
			return 0;
		} else if (zipcode > 46000 & zipcode < 48000){
			//Indiana
			return salesSubTotal * .07;
		} else if ( zipcode > 98000 & zipcode < 99500){
			//Washington
			return salesSubTotal * .0960;
		} else if (zipcode > 96700 & zipcode < 96900){
			//Hawaii
			return salesSubTotal * .045;
		}else {
			throw new IllegalArgumentException("Zipcode not in our records");
			
		}
	}
	


}
