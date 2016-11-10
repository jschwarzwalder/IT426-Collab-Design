package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

public class BoldDecorator implements IDecorateHtml
{
	private IDecorateHtml html;
	
	public BoldDecorator(IDecorateHtml html) 
	{
		this.html = html;
	}

	@Override
	public String generateHtml() 
	{
		//retrieve the subject's html
		String subjectHtml = html.generateHtml();
		
		return "<strong>" + subjectHtml + "</strong>";
	}
}
