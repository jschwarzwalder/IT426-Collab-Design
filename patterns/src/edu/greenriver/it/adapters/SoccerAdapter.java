package edu.greenriver.it.adapters;

import java.util.Map;

import edu.greenriver.it.magazines.IAthlete;
import edu.greenriver.it.patterns.SoccerAthlete;

public class SoccerAdapter implements IAthlete
{
	//this object will fulfill our interface
	private SoccerAthlete athlete;
	
	public SoccerAdapter(SoccerAthlete athlete)
	{
		this.athlete = athlete;
	}

	@Override
	public String getFirstName() 
	{
		String[] parts = athlete.getFullName().split(" ");
		return parts[0];
	}

	@Override
	public String getLastName() 
	{
		String[] parts = athlete.getFullName().split(" ");
		return parts[parts.length - 1];
	}

	@Override
	public String getEntireStatLine() 
	{
		Map<String, Object> stats = athlete.getStats();
		StringBuilder builder = new StringBuilder();
		
		for (String type : stats.keySet())
		{
			Object value = stats.get(type);
			
			builder.append(type);
			builder.append(" : ");
			builder.append(value);
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
