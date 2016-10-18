package edu.greenriver.it.magazines;

public interface IAthlete 
{
	public String getFirstName();
	public String getLastName();
	
	/*
	 * Expecting output like so:
	 * type : value \n
	 * type : value \n
	 * ...
	 */
	public String getEntireStatLine();
}
