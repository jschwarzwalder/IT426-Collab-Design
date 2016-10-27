package edu.greenriver.it.magazines;

@SuppressWarnings("unused")
public class Magazine 
{
	private String name;
	
	public Magazine(String name)
	{
		this.name = name;
	}
	
	public void printAthlete(IAthlete athlete)
	{
		System.out.println("Athlete: " + athlete.getFirstName() + 
				           ", " + athlete.getLastName());
		
		printAthleteStats(athlete);
	}
	
	private void printAthleteStats(IAthlete athlete)
	{
		System.out.println("Stats\n" + athlete.getEntireStatLine());
	}
}
