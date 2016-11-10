package edu.greenriver.it.html;

import edu.greenriver.it.decorators.SimpleTagDecorator;

public class TestDecorators 
{
	public static void main(String[] args) 
	{
		IDecorateHtml subject = new SimpleTagDecorator(HtmlTags.H1, 
				                new SimpleTagDecorator(HtmlTags.ITALICS, 
				                new HtmlSubject("hello world!")));
		
		//decorate!
		System.out.println(subject.generateHtml());
	}

}
