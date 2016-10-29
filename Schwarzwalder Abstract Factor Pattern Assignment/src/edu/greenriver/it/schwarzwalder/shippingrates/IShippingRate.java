/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * IShippingRate.java
 * Calculates Shipping Rate
 */
package edu.greenriver.it.schwarzwalder.shippingrates;

/**
 * Calculates Shipping Rate
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IShippingRate {
	
	public Rate getRate(String type, double weight);

}
