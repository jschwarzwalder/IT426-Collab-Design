/**
 * Jami Schwarzwalder
 * 10/17/2016
 * JsonWriter.java
 * This file reads and writes products to and from JSON files.
 */
package edu.greenriver.it.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.greenriver.it.products.Product;

/**
 * This class reads and writes products to and from JSON files.
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class JsonWriter extends Object implements Writer {

	/**
	 * Saves an object to a file File is saved as a JSON file in data folder
	 * 
	 * Using JSON-Simple libraries.
	 * 
	 * 
	 * @param object
	 *            a product object to be written to file
	 */
	@Override
	public void saveObject(Product object) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", object.getName());
		dataObject.put("price", object.getPrice());

		JSONArray keywords = new JSONArray();
		for (String keyword : object.getKeywords()) {
			keywords.add(keyword);
		}

		dataObject.put("keywords", keywords);

		try {
			// Write to file
			FileWriter fileWriter = new FileWriter(getFilename(object.getName()));

			fileWriter.write(dataObject.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Loads a Product from the given JSON file
	 * File should be located in the data directory
	 * 
	 * @param name name of a Product to be returned from file
	 * @return product with name matching name param
	 *
	 */	
	@Override
	public Product loadObject(String name) {
		JSONParser parser = new JSONParser();
		try{
			Object object = parser.parse(new FileReader(getFilename(name)));
			
			JSONObject dataObject = (JSONObject) object;
			
			String productName = (String) dataObject.get("name");
			double productPrice = (Double) dataObject.get("price");
			
			JSONArray keywords = (JSONArray) dataObject.get("keywords");
			String[] productTags = new String[keywords.size()];
			
			for (int i = 0; i < productTags.length; i++){
				productTags[i] = (String) keywords.get(i);
			}
			
			return new Product(productName, productPrice, productTags);
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return null;
	}


	private String getFilename(String proudctName) {
		return "data/" + proudctName + ".json";
	}

}
