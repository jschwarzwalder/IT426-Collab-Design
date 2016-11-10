package edu.greenriver.it.decorators;

import edu.greenriver.it.html.IDecorateHtml;

public class LinkDecorator implements IDecorateHtml
{
	private IDecorateHtml subject;
	private String url;
	
	public LinkDecorator(IDecorateHtml subject, String url) 
	{
		this.url = url;
		this.subject = subject;
	}

	@Override
	public String generateHtml() 
	{
		return "<a href=\"" + url + "\">" + subject.generateHtml() + "</a>";
	}
}
