/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * EUOrderFactory.java
 * Generate taxes and shipping rates for EU customers.
 */
package edu.greenriver.it.schwarzwalder.factory;

import edu.greenriver.it.schwarzwalder.shippingrates.EUShippingRate;
import edu.greenriver.it.schwarzwalder.shippingrates.IShippingRate;
import edu.greenriver.it.schwarzwalder.taxcalculations.EUSalesTax;
import edu.greenriver.it.schwarzwalder.taxcalculations.ISalesTax;

/**
 * Generate taxes and shipping rates for EU customers.
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class EUOrderFactory implements IOrderFactory {

	private String region;

	/**
	 * Creates a new EUOrderFactory
	 *
	 * @param region
	 *            EU country name or code
	 */
	public EUOrderFactory(String region) {
		this.region = region;
	}

	/**
	 * Generate collection of sales tax for EU customers
	 * 
	 * @return Sales Tax
	 */
	@Override
	public ISalesTax getTaxObject() {

		return new EUSalesTax(region);
	}

	/**
	 * Generate shipping rates for EU customers.
	 * 
	 * @return Shipping Rate
	 */
	@Override
	public IShippingRate getRateObject() {

		return new EUShippingRate();
	}

}
