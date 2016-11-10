package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

public class ItalicsDecorator implements IDecorateHtml
{
	private IDecorateHtml html;
	
	public ItalicsDecorator(IDecorateHtml html) 
	{
		this.html = html;
	}

	@Override
	public String generateHtml() 
	{
		//retrieve the subject's html
		String subjectHtml = html.generateHtml();
		
		return "<em>" + subjectHtml + "</em>";
	}
}
