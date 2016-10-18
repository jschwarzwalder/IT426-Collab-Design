/**
 * Jami Schwarzwalder
 * 10/14/2016
 * Writer.java
 * This file reads and writes products to and from files.
 */
package edu.greenriver.it.fileio;

import edu.greenriver.it.products.Product;

/**
 * This interface reads and writes products to and from files.
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface Writer {
	
	/**
	 * Saves an object to a file
	 * File should be saved in data folder
	 * 
	 * The class implementing this interface can choose "how" to write to the file
	 * 
	 * @param object a product object to be written to file
	 */
	public void saveObject(Product object);
	
	/**
	 * Loads a Product from the file name given
	 * File should be located in the data directory
	 * 
	 * @param name name of a Product to be returned from file
	 * @return product with name matching String param
	 *
	 */	
	public Product loadObject(String name);
}
