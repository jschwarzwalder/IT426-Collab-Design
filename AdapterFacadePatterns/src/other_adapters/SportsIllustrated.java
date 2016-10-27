package edu.greenriver.it.other_adapters;

@SuppressWarnings("unused")
public class SportsIllustrated 
{
	private String name;
	
	public SportsIllustrated(String name)
	{
		this.name = name;
	}
	
	public void printAthlete(MyAthlete myAthlete)
	{
		System.out.println(myAthlete.getFirstName() + " " +
	                       myAthlete.getMiddle() + ". " + 
				           myAthlete.getLast() + ".");
		
		String[] stats = myAthlete.getStats();
		for (String stat : stats)
		{
			System.out.println("Stat: " + stat);
		}
	}
}
