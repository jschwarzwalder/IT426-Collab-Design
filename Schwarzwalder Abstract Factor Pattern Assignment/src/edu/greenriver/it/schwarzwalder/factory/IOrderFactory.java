/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * IOrderFactory.java
 * Generate taxes and shipping rates for US and EU customers.
 */
package edu.greenriver.it.schwarzwalder.factory;

import edu.greenriver.it.schwarzwalder.shippingrates.IShippingRate;
import edu.greenriver.it.schwarzwalder.taxcalculations.ISalesTax;

/**
 * Generate taxes and shipping rates for US and EU customers.
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IOrderFactory {

	/**
	 * Generate collection of sales tax for US and EU customers
	 * 
	 * @return Sales Tax 
	 */
	public ISalesTax getTaxObject();
	
	
	/**
	 * Generate shipping rates for US and EU customers.
	 * 
	 * @return Shipping Rate
	 */
	public IShippingRate getRateObject();
}
