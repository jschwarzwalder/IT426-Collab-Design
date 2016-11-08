/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * TestDecorators.java
 * [Description Here]
 */
package edu.greenriver.it.html;

import edu.greenriver.it.decorators.BoldDecorator;
import edu.greenriver.it.decorators.HtmlTags;
import edu.greenriver.it.decorators.ItalicsDecorator;
import edu.greenriver.it.decorators.SimpleTagDecorator;

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

		IDecorateHtml subject = new ItalicsDecorator(new BoldDecorator(new HTMLSubject("hello world!")));

		// decorate!
		System.out.println(subject.generateHTML());

		IDecorateHtml subject2 = new SimpleTagDecorator(HtmlTags.H1,
				new SimpleTagDecorator(HtmlTags.ITALICS, new HTMLSubject("hello world!")));

		// decorate!
		System.out.println(subject2.generateHTML());

	}

}
