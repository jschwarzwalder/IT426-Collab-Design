package edu.greenriver.it.html;

public class HtmlSubject implements IDecorateHtml
{
	private String html;
	
	public HtmlSubject(String html) 
	{
		this.html = html;
	}

	@Override
	public String generateHtml()
	{
		return html;
	}
}
