/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * EUShipingRate.java
 * Calculates shipping rate in Europe
 */
package edu.greenriver.it.schwarzwalder.shippingrates;

import edu.greenriver.it.schwarzwalder.shippingrates.IShippingRate;
import edu.greenriver.it.schwarzwalder.shippingrates.Rate;

/**
 * Calculates shipping rate in Europe
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class EUShippingRate implements IShippingRate {

	/**
	 * Calculates shipping rate inside Europe
	 * 
	 * @param type
	 * @param weight
	 * @return Rate for shipping this package 
	 */
	@Override
	public Rate getRate(String type, double weight) {
		//Always ships standard, 0.5 euro per pound
		Rate rate =  new Rate("standard", weight * 0.5);
		return rate;
		
		
	}

	

}
