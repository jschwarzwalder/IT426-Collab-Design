/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * ItalicsDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class ItalicsDecorator implements IDecorateHtml{
	
	private IDecorateHtml html;
	
	
	
	public ItalicsDecorator(IDecorateHtml html) {
		
		this.html = html;
	}



	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.html.IDecorateHtml#generateHTML()
	 */
	@Override
	public String generateHTML() {
		//retrieve the subjec's html
		String subjectHtml = html.generateHTML();
		
		return "<em>" + subjectHtml + "</em>";
	}

}
