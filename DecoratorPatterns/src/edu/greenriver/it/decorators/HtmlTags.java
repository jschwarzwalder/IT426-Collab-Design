/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * HtmlTags.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public enum HtmlTags {
	ITALICS("em"),
	BOLD("strong"),
	PARAGRAPH("p"),
	H1("h1"),
	H2("h2"),
	H3("h3"),
	H4("h4"),
	H5("h5"),
	H6("h6");
	
	//FIELDS..
	private String htmlValue;
	
	//constructors...
	private HtmlTags(String htmlValue){
		this.htmlValue = htmlValue;
	}
	
	//methods..
	public String getHTMLValue(){
		return htmlValue;
	}
}
