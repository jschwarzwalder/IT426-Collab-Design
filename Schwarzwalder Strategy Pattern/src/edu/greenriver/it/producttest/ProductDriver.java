package edu.greenriver.it.producttest;

import java.io.File;

import edu.greenriver.it.fileio.JsonWriter;
import edu.greenriver.it.fileio.ObjectWriter;
import edu.greenriver.it.fileio.Writer;
import edu.greenriver.it.fileio.XmlWriter;
import edu.greenriver.it.products.Product;

public class ProductDriver {

	public static void main(String[] args) {
		// make Product
		Product kittens = new Product("Exploding Kittens", 19.99,
				new String[] { "card game", "humor", "cats", "party game" });
		int userSelection = 0;

		while (userSelection != 4) {
			// Print to console
			Console.print("Product Manager Application");
			Console.print("Write a product to a file:");
			Console.print("Product: " + kittens.toString());
			System.out.println();
			Console.print("1. Save as JSON");
			Console.print("2. Save as XML");
			Console.print("3. Save as Java Object");
			Console.print("4. Exit");

			userSelection = Console.getInt("Select a file format");

			Console.print("Writing product to file...");
			Writer testWriter = null;

			while (testWriter == null) {
				if (userSelection == 1) {

					testWriter = new JsonWriter();

				} else if (userSelection == 2) {
					testWriter = new XmlWriter();

				} else if (userSelection == 3) {
					testWriter = new ObjectWriter();

				} else if (userSelection == 4) {
					return;

				} else {
					userSelection = Console.getInt("Invalid Input. Select a file format");
				}
			}

			// save file in format selected by User
			testWriter.saveObject(kittens);
			Console.print("Object saved to file.");
			System.out.println();

			// read from file and print out
			Console.print("Reading product from file...");
			System.out.println(testWriter.loadObject("Exploding Kittens"));
			System.out.println();
			System.out.println();
			System.out.println();

		}

	}

}
