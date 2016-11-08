/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * LinkDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class LinkDecorator implements IDecorateHtml {

	private IDecorateHtml subject;
	private String url;
	
	
	public LinkDecorator(IDecorateHtml subject, String url) {
		
		this.url = url;
		this.subject = subject;
	}


	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.html.IDecorateHtml#generateHTML()
	 */
	@Override
	public String generateHTML() {
		
		return "<a href=\"" + url + "\">" + subject.generateHTML() + "</a>";
	}

}
