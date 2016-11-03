/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * Driver.java
 * [Description Here]
 */
package edu.greenriver.it.schwarzwalder.driver;

import edu.greenriver.it.schwarzwalder.factory.EUOrderFactory;
import edu.greenriver.it.schwarzwalder.factory.IOrderFactory;
import edu.greenriver.it.schwarzwalder.factory.USOrderFactory;
import edu.greenriver.it.schwarzwalder.shippingrates.Rate;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public abstract class Driver {


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Console.print("Where would you like to ship to?");
		Console.print("1: US");
		Console.print("2: EU");

		IOrderFactory factory;
		int userRegion;
		do {
			userRegion = Console.getInt("Select a Region");
			if (userRegion == 1) {
				int zip = Console.getInt("Enter Zipcode");
				factory = new USOrderFactory(zip);
			} else if (userRegion == 2) {
				String region = Console.getString("Enter Country name or code");
				factory = new EUOrderFactory(region);
			}
		} while (userRegion > 2 || userRegion < 1);

		String userOrderName = Console.getString("Enter order name");
		double userWeight = Console.getDouble("Enter order weight");
		
		Rate shippingRate = null;
		String userShipmentType;
		do
		{
			userShipmentType = Console.getString("Enter shipment type");
		} while (shippingRate == null);

	}

}
