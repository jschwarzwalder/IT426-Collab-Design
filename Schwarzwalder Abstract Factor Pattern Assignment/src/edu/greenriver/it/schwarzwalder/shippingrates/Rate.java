/**
 * Jami Schwarzwalder
 * Oct 29, 2016
 * Rate.java
 * A shipping rate has a type {"priority", "standard"} and cost.
 */
package edu.greenriver.it.schwarzwalder.shippingrates;

/**
 * A shipping rate has a type {"priority", "standard"} and cost.
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class Rate {
	
	private String shippingType;
	private double rate;
	
	
	
	public Rate(String shippingType, double rate) {
		this.shippingType = shippingType;
		this.rate = rate;
	}

	public String getShippingType(){
		return shippingType;
	};
	
	public double getRate(){
		return rate;
	}
}
