/**
 * Jami Schwarzwalder
 * 10/14/2016
 * Product.java
 * This file stores the name, price, and keywords of a product.
 */
package edu.greenriver.it.products;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a Product.
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
@XmlRootElement
public class Product implements Serializable {
	
	/**
	 * Generated Version ID 
	 * for Serializable Interface
	 */
	private static final long serialVersionUID = 8507891213238259981L;
	
	private String name;
	private double price;
	private String[] keywords;
	
	/**
	 * Creates a new Product
	 *
	 * @param productName the name of the product
	 * @param productPrice the cost of the product
	 * @param productTags keywords describing product
	 */
	public Product(String productName, double productPrice, String[] productTags) {
		this.name = productName;
		this.price = productPrice;
		this.keywords = productTags;
	}
	
	
		
	/**
	 * Creates an empty Product
	 *
	 */
	public Product() {
		this("Unknown Product", 0 , new String[0]);
	}



	/**
	 * Gets the name of the product
	 * 
	 * @return the name of the product
	 */
	@XmlElement
	public String getName() {
		return name;
	}



	/**
	 * Sets the name of the product
	 * 
	 * @param name the new name of the product
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * Gets the price of the product
	 * 
	 * @return the price of the product
	 */
	public double getPrice() {
		return price;
	}



	/**
	 * Sets the price of the product
	 * 
	 * @param price the new price of the product
	 */
	public void setPrice(double price) {
		this.price = price;
	}



	/**
	 * Gets the keywords of the product
	 * 
	 * @return the keywords of the product
	 */
	public String[] getKeywords() {
		return keywords;
	}



	/**
	 * Sets the keywords of the product
	 * 
	 * @param price the new keywords of the product
	 */
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}



	/* 
	 * Overrides the default toString method
	 * 
	 * @return the name, price, and keywords of a product.
	 */
	@Override
	public String toString() {
		return "Product: " + name + ", $" + price + " " + Arrays.toString(keywords) + " ";
	}



}
