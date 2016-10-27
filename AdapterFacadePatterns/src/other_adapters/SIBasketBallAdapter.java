package edu.greenriver.it.other_adapters;

import java.util.Set;

import edu.greenriver.it.patterns.BasketBallAthlete;
import edu.greenriver.it.patterns.BasketBallAthlete.Stat;

public class SIBasketBallAdapter extends MyAthlete
{
	private BasketBallAthlete athlete;
	
	//constructors...
	public SIBasketBallAdapter(BasketBallAthlete athlete)
	{
		this.athlete = athlete;
	}
	
	public String getFirstName() 
	{
		return athlete.getFname();
	}

	public char getMiddle() 
	{
		return ' ';
	}

	public char getLast() 
	{
		return athlete.getLname().charAt(0);
	}

	public String[] getStats() 
	{
		Set<Stat> stats = athlete.getStats();
		String[] results = new String[stats.size()];
		
		//copy over my values
		int count = 0;
		for (Stat stat : stats)
		{
			StringBuilder builder = new StringBuilder();
			builder.append(stat.getType());
			builder.append(" : ");
			builder.append(stat.getValue());
			builder.append("\n");
			
			results[count] = builder.toString();
			count++;
		}
		
		return results;
	}
}
