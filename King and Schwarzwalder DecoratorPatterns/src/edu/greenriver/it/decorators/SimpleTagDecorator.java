/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * SimpleTagDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class SimpleTagDecorator implements IDecorateHtml {
	private IDecorateHtml html;
	private HtmlTags tagType;

	public SimpleTagDecorator ( HtmlTags tagType, IDecorateHtml html) {
		
		this.html = html;
		this.tagType = tagType;
		
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
		
		return "<" + tagType.getHTMLValue() + ">" + subjectHtml + "</" + tagType.getHTMLValue() + ">";
	}

}

