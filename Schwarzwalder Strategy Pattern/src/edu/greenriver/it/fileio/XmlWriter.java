/**
 * Jami Schwarzwalder
 * 10/17/2016
 * XmlWriter.java
 * This file reads and writes products to and from XML files.
 */
package edu.greenriver.it.fileio;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import edu.greenriver.it.products.Product;

/**
 * This class reads and writes products to and from XML files.
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class XmlWriter implements Writer {

	/**
	 * Saves an object to a file File is saved as a XML file in data folder
	 * 
	 * Using JSON-Simple libraries.
	 * 
	 * 
	 * @param object
	 *            a product object to be written to file
	 */
	@Override
	public void saveObject(Product object) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Product.class);
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, new File( getFilename( object.getName() ) ) );
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * Loads a Product from the given XML file
	 * File should be located in the data directory
	 * 
	 * @param name name of a Product to be returned from file
	 * @return product with name matching name param
	 *
	 */	
	@Override
	public Product loadObject(String name) {

		
		
		try {
			JAXBContext context = JAXBContext.newInstance(Product.class);
			
			 Unmarshaller u = context.createUnmarshaller();
		     Product dataObject = (Product)u.unmarshal( new File( getFilename(name) ) );
		     
		     return dataObject;
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	private String getFilename(String proudctName) {
		return "data/" + proudctName + ".xml";
	}

}
