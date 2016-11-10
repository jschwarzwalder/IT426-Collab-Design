/**
 * Jami Schwarzwalder
 * Nov 8, 2016
 * BorderDecorator.java
 * [Description Here]
 */
package edu.greenriver.it.decorators;

import java.awt.Color;

import edu.greenriver.it.html.IDecorateHtml;

/**
 *
 * @author Jami Schwarzwalder and Stephen King
 * @version 1.1
 */
public class BorderDecorator implements IDecorateHtml {

	private IDecorateHtml html;
	private Color borderColor;
	private BorderStyle borderStyle;
	private int borderThickness;

	public enum BorderStyle {
		SOLID("solid"), DASHED("dashed");

		private String borderValue;

		private BorderStyle(String borderValue) {
			this.borderValue = borderValue;

		}

		public String getBorderValue() {
			return borderValue;
		}

	}

	public BorderDecorator(Color borderColor, BorderStyle borderStyle, int borderThickness, IDecorateHtml html) {
		this.borderColor = borderColor;
		this.borderStyle = borderStyle;
		this.borderThickness = borderThickness;
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
		return "<div style='border-style:" + borderStyle.getBorderValue() + "; border-width:" + borderThickness
				+ "px; border-color:rgb(" + borderColor.getRed() + ", " + borderColor.getGreen() + ", "
				+ borderColor.getBlue() + ")'>" + html.generateHTML() + "</div>";
	}

}
