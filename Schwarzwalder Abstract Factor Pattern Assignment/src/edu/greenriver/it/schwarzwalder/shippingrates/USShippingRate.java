/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * USShippingRate.java
 * Calculates shipping rate in United States
 */
package edu.greenriver.it.schwarzwalder.shippingrates;

/**
 * Calculates shipping rate in United States
 * 
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class USShippingRate implements IShippingRate {

	/**
	 * Calculates shipping rate inside United States
	 * 
	 * @param type
	 * @param weight
	 * @return Rate for shipping this package 
	 */
	@Override
	public Rate getRate(String type, double weight) {
		
		if (type == "priority") {
			return new Rate("priority", weight * 3);

		} else if (type =="standard"){
			if (weight < 1){
				return new Rate("standard", weight * 1);

			} else if (weight < 6){
				return new Rate("standard", weight * 5);

			} else if (weight <= 10){
				return new Rate("standard", weight * 10);

			} else {
				return new Rate("standard", weight * 15);

			}
		
		} else {
			return null;
		}
		
		
		
	}

}
