/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * USOrderFactory.java
 * Generate taxes and shipping rates for US customers.
 */
package edu.greenriver.it.schwarzwalder.factory;

import edu.greenriver.it.schwarzwalder.shippingrates.IShippingRate;
import edu.greenriver.it.schwarzwalder.shippingrates.USShippingRate;
import edu.greenriver.it.schwarzwalder.taxcalculations.ISalesTax;
import edu.greenriver.it.schwarzwalder.taxcalculations.USSalesTax;

/**
 * Generate taxes and shipping rates for US customers.
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class USOrderFactory implements IOrderFactory {

	private int zipcode;

	
	/**
	 * Creates a new USSalesTax
	 *
	 * @param zipcode
	 *            shipment destination
	 */
	public USOrderFactory(int zipcode) {
		this.zipcode = zipcode;
	}
	
	/**
	 * Generate collection of sales tax for US customers
	 * 
	 * @return Sales Tax 
	 */
	@Override
	public ISalesTax getTaxObject() {
		// TODO Auto-generated method stub
		return new USSalesTax(zipcode);
	}

	/**
	 * Generate shipping rates for EU customers.
	 * 
	 * @return Shipping Rate
	 */
	@Override
	public IShippingRate getRateObject() {
		// TODO Auto-generated method stub
		return new USShippingRate();
	}

}
