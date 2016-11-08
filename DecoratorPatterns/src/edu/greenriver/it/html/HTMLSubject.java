/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * HTMLSubject.java
 * Decorator Subject
 */
package edu.greenriver.it.html;

/**
 * Decorator Subject 
 * (we will apply decoration to this)
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class HTMLSubject {
	
	private String html;
	
	public HTMLSubject(String html){
		this.html = html;
	}
	
	public String generateHTML() {
		
		return html;
		
	}

}
