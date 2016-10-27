package edu.greenriver.it.other_adapters;

public class MyAthlete 
{
	//fields
	private String firstName;
	private char middle;
	private char last;
	
	private String[] stats;
	
	public MyAthlete()
	{
		firstName = "not specified";
		middle = '\u0000'; //null character
		last = '\u0000';
		
		stats = new String[0];
	}

	public MyAthlete(String firstName, char middle, char last, String[] stats) 
	{
		this.firstName = firstName;
		this.middle = middle;
		this.last = last;
		this.stats = stats;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public char getMiddle() 
	{
		return middle;
	}

	public char getLast() 
	{
		return last;
	}

	public String[] getStats() 
	{
		return stats;
	}
}
