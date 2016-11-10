/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * DocumentDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 * Driver Class
 *
 * @author Jami Schwarzwalder and Stephen King
 * @version 1.1
 */
public class DocumentDecorator implements IDecorateHtml {

	private String title;
	private IDecorateHtml html;

	public DocumentDecorator(String title, IDecorateHtml html) {
		this.title = title;
		this.html = html;
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.html.IDecorateHtml#generateHTML()
	 */
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		return "<!DOCTYPE html><html><head><title>" + title + "</title></head><body>" + html.generateHTML()
				+ "</body></html>";
		
	}

}
