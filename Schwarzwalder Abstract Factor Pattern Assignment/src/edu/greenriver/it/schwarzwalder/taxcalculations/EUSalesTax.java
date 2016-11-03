/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * EUSalesTax.java
 * Calculates tax in Europe
 */
package edu.greenriver.it.schwarzwalder.taxcalculations;

/**
 * Calculates tax in Europe
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class EUSalesTax implements ISalesTax {

	private String region;

	/**
	 * Creates a new EUSalesTax
	 *
	 * @param region
	 *            EU country name or code
	 */
	public EUSalesTax(String region) {
		this.region = region;
	}

	/**
	 * Handles tax calculations based on region
	 * 
	 * @param salesSubTotal
	 * @return calculated VAT tax
	 */
	@Override
	public double calculateTax(double salesSubTotal) {

		if (region.equalsIgnoreCase("austria") || region.equalsIgnoreCase("AT")) {
			return salesSubTotal * .20;
		} else if (region.equalsIgnoreCase("finland") || region.equalsIgnoreCase("FI")) {
			return salesSubTotal * .24;
		} else if (region.equalsIgnoreCase("luxembourg") || region.equalsIgnoreCase("LU")) {
			return salesSubTotal * .17;
		} else if (region.equalsIgnoreCase("spain") || region.equalsIgnoreCase("ES")) {
			return salesSubTotal * .21;
		} else if (region.equalsIgnoreCase("france") || region.equalsIgnoreCase("FR")) {
			return salesSubTotal * .20;
		} else if (region.equalsIgnoreCase("germany") || region.equalsIgnoreCase("DE")) {
			return salesSubTotal * .19;
		} else if (region.equalsIgnoreCase("greece") || region.equalsIgnoreCase("EL")) {
			return salesSubTotal * .24;
		} else if (region.equalsIgnoreCase("united kingdom") || region.equalsIgnoreCase("UK")) {
			return salesSubTotal * .20;
		} else if (region.equalsIgnoreCase("sweeden") || region.equalsIgnoreCase("SE")) {
			return salesSubTotal * .25;
		} else {
			throw new IllegalArgumentException("Region's VAT rate not in our records");

		}
	}

}
