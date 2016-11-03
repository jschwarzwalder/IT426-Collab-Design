/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * Driver.java
 * Utilizing Factory Patterns with Console
 */
package edu.greenriver.it.schwarzwalder.driver;

import java.text.DecimalFormat;

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

	private final static int SUBTOTAL = 20;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		createOrder();
	}

	/**
	 * 
	 */
	private static void createOrder() {
		Console.print("Where would you like to ship to?");
		Console.print("1: US");
		Console.print("2: EU");

		IOrderFactory factory = null;
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
		} while (factory == null);

		String userOrderName = Console.getString("Enter order name");
		double userWeight = Console.getDouble("Enter order weight");

		Rate shippingRate = null;
		String userShipmentType;
		do {
			userShipmentType = Console.getString("Enter shipment type");
			shippingRate = factory.getRateObject().getRate(userShipmentType, userWeight);
		} while (shippingRate == null);

		double tax = factory.getTaxObject().calculateTax(20);
		double total = tax + SUBTOTAL + shippingRate.getRate();

		DecimalFormat dollarFormat = new DecimalFormat("###0.00");

		StringBuilder orderDetails = new StringBuilder();
		orderDetails.append("Order details: ");
		orderDetails.append(userOrderName);
		orderDetails.append(" - weight: ");
		orderDetails.append(userWeight);
		orderDetails.append(" , shipping type: ");
		orderDetails.append(userShipmentType);
		orderDetails.append("\nShipping cost: ");
		orderDetails.append(dollarFormat.format(shippingRate.getRate()));
		orderDetails.append("\nSubtotal: ");
		orderDetails.append(dollarFormat.format(SUBTOTAL));
		orderDetails.append("\nTax: ");
		orderDetails.append(dollarFormat.format(tax));
		orderDetails.append("\nTotal: ");
		orderDetails.append(dollarFormat.format(total));

		Console.print(orderDetails.toString());

		boolean validResponse = false;
		do {
			String placeNewOrder = Console.getString("Would you like to place another order? (Y/N)");

			if (placeNewOrder.equalsIgnoreCase("yes") || placeNewOrder.equalsIgnoreCase("Y")) {
				createOrder();
				validResponse = true;
			} else if (placeNewOrder.equalsIgnoreCase("no") || placeNewOrder.equalsIgnoreCase("N")) {
				validResponse = true;
			}
		} while (!validResponse);

	}

}
