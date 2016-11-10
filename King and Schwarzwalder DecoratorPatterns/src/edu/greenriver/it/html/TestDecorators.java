/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * TestDecorators.java
 * [Description Here]
 */
package edu.greenriver.it.html;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import edu.greenriver.it.decorators.BorderDecorator;
import edu.greenriver.it.decorators.BorderDecorator.BorderStyle;
import edu.greenriver.it.decorators.DocumentDecorator;
import edu.greenriver.it.decorators.ImageDecorator;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class TestDecorators {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String imageURL = "http://4.bp.blogspot.com/-XYg-7n3jguQ/T73fforiR6I/AAAAAAAAAjA/oeQPY22tDNs/s1600/Happy_smiley_face.png";
		String text = "Cupcake ipsum dolor sit amet ice cream chocolate cake. Chocolate wafer halvah wafer danish donut. Bonbon chocolate bar icing lollipop apple pie cake candy pie. Pie oat cake jujubes tootsie roll topping muffin chocolate lemon drops carrot cake. Bonbon oat cake cupcake gingerbread pudding jelly beans sweet roll gingerbread. Cupcake lemon drops halvah macaroon cotton candy pudding cotton candy. Wafer ice cream jujubes ice cream donut donut. Cake dragée gummi bears marshmallow pudding tootsie roll. Candy dragée ice cream bonbon bear claw.";
		String title = "426 Test Website";
		
		IDecorateHtml myWebsite = new DocumentDecorator(title, 
				new BorderDecorator(Color.PINK, BorderStyle.SOLID, 5, new ImageDecorator( imageURL, 
						new HTMLSubject(text))));
		
		// decorate!
		PrintWriter file;
		try {
			file = new PrintWriter("myfile.html");
			file.println(myWebsite.generateHTML());
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		

		

	}

}
