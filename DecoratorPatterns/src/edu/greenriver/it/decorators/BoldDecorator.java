/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * BoldDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class BoldDecorator implements IDecorateHtml {
	private IDecorateHtml html;

	public BoldDecorator(IDecorateHtml html) {
		
		this.html = html;
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.html.IDecorateHtml#generateHTML()
	 */
	@Override
	public String generateHTML() {
		//retieve the subject's html
		
		
		String subjectHtml = html.generateHTML();
		
		return "<strong>" + subjectHtml + "</strong>";
	}

}
