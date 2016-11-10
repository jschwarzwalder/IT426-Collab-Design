package edu.greenriver.it.decorators;

import edu.greenriver.it.html.HtmlTags;
import edu.greenriver.it.html.IDecorateHtml;

public class SimpleTagDecorator implements IDecorateHtml
{
	private IDecorateHtml html;
	private HtmlTags tagType;
	
	public SimpleTagDecorator(HtmlTags tagType, IDecorateHtml html) 
	{
		this.html = html;
		this.tagType = tagType;
	}

	@Override
	public String generateHtml() 
	{
		//retrieve the subject's html
		String subjectHtml = html.generateHtml();
		
		return "<" + tagType.getHtmlValue() + ">" + 
		       subjectHtml + "</" + tagType.getHtmlValue() + ">";
	}
}
