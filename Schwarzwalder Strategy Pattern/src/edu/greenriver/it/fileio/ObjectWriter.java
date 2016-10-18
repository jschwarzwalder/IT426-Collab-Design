/**
 * Jami Schwarzwalder
 * 10/14/2016
 * ObjectWriter.java
 * This file reads and writes products to and from binary files.
 */

package edu.greenriver.it.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.greenriver.it.products.Product;

/**
 * This class reads and writes products to and from binary files.
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class ObjectWriter implements Writer {

	/**
	 * Saves an object to a file File is saved as binary file in data folder
	 * 
	 * Using built in Object Serialization.
	 * 
	 * 
	 * @param object
	 *            a product object to be written to file
	 */
	@Override
	public void saveObject(Product object) {
		FileOutputStream dataFile;
		try {
			dataFile = new FileOutputStream(getFilename(object.getName()));
			ObjectOutputStream dataObject = new ObjectOutputStream(dataFile);

			dataObject.writeObject(object);

			dataObject.close();
		} catch (FileNotFoundException e) {
			// If you are trying to write to a protected directory,
			// or if file exists but protected(no write access)
			e.printStackTrace();
		} catch (IOException e) {
			// If there is an error when trying to write ObjectOutputStream
			e.printStackTrace();
		}

	}

	/**
	 * Loads a Product from the given binary file
	 * File should be located in the data directory
	 * 
	 * @param name name of a Product to be returned from file
	 * @return product with name matching name param
	 *
	 */	
	@Override
	public Product loadObject(String name) {
		try {
			FileInputStream dataFile = new FileInputStream(getFilename(name));
			ObjectInputStream dataObject = new ObjectInputStream(dataFile);

			Product namedProduct = (Product) dataObject.readObject();

			dataObject.close();

			return namedProduct;
		} catch (FileNotFoundException e) {
			// If you are trying to read file that does not exist,
			// or if file exists but protected(no read access)
			e.printStackTrace();

		} catch (IOException e) {
			// If there is an error when trying to read ObjectOutputStream
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// if object's class cannot be found 
			e.printStackTrace();
		}
		
		return null;

	}

	private String getFilename(String productName) {
		return "data/" + productName + ".bin";
	}
}
