package edu.greenriver.it.producttest;


import edu.greenriver.it.fileio.JsonWriter;
import edu.greenriver.it.fileio.ObjectWriter;
import edu.greenriver.it.fileio.Writer;
import edu.greenriver.it.products.Product;

public class ProductDriver {
	
	public static void main (String[] args){
		Product kittens  = 
				new Product("Exploding Kittens", 19.99, 
						new String[] {"card game", "humor", "cats", "party game"});
	
		ObjectWriter testObjectWriter = new ObjectWriter();
		
		testObjectWriter.saveObject(kittens);
		
		System.out.println(testObjectWriter.loadObject("Exploding Kittens"));
		
		Writer testJsonWriter = new JsonWriter();
		
		testJsonWriter.saveObject(kittens);
		
		System.out.println(testJsonWriter.loadObject("Exploding Kittens"));
	}

}
