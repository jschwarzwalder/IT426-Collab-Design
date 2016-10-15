package edu.greenriver.it.producttest;


import edu.greenriver.it.fileio.ObjectWriter;
import edu.greenriver.it.products.Product;

public class ProductDriver {
	
	public static void main (String[] args){
		Product kittens  = 
				new Product("Exploding Kittens", 19.99, 
						new String[] {"card game", "humor", "cats"});
	
		ObjectWriter testObjectWriter = new ObjectWriter();
		
		testObjectWriter.saveObject(kittens);
		
		System.out.println(testObjectWriter.loadObject("Exploding Kittens"));
	}

}
