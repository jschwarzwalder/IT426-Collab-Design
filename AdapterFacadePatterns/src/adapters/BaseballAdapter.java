package edu.greenriver.it.adapters;

import java.util.List;

import edu.greenriver.it.magazines.IAthlete;
import edu.greenriver.it.patterns.BaseballAthlete;

public class BaseballAdapter implements IAthlete
{
	private BaseballAthlete athlete;
	
	public BaseballAdapter(BaseballAthlete athlete)
	{
		this.athlete = athlete;
	}

	@Override
	public String getFirstName() 
	{
		return athlete.getFname();
	}

	@Override
	public String getLastName() 
	{
		return athlete.getLname();
	}

	@Override
	public String getEntireStatLine() 
	{
		StringBuilder builder = new StringBuilder();
		
		//assemble the stat line
		List<String> stats = athlete.getStats();
		for (int i = 0; i < stats.size(); i++)
		{
			builder.append(stats.get(i));
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
