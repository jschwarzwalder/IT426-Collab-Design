package edu.greenriver.it.products;

import java.io.Serializable;
import java.math.MathContext;
import java.util.Arrays;

public class Product implements Serializable {
	
	/**
	 * Generated Version ID 
	 * for Serializable Interface
	 */
	private static final long serialVersionUID = 8507891213238259981L;
	
	private String name;
	private double price;
	private String[] keywords;
	
	public Product(String productName, double productPrice, String[] productTags) {
		this.name = productName;
		this.price = productPrice;
		this.keywords = productTags;
	}
	
	
		
	public Product() {
		this("Unknown Product", 0 , new String[0]);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String[] getKeywords() {
		return keywords;
	}



	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}



	@Override
	public String toString() {
		return "Product: " + name + ", $" + price + " " + Arrays.toString(keywords) + " ";
	}



}
