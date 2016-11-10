/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * ImageDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder and Stephen King
 * @version 1.1
 */
public class ImageDecorator implements IDecorateHtml {

	private String image;
	private IDecorateHtml html;
	
	public ImageDecorator(String image, IDecorateHtml html){
		this.image = image;
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
		return "<p> <img src=\"" + image + "\" style=\"float:right\" />" + html.generateHTML() + "</p>";
	}

}
