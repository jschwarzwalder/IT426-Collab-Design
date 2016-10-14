package edu.greenriver.it.adapters;

import java.util.Map;

import edu.greenriver.it.patterns.IAthlete;
import edu.greenriver.it.patterns.SoccerAthleete;

public class SoccerAdapter implements IAthlete {
	
	private SoccerAthleete athlete;
	
	public SoccerAdapter(SoccerAthleete athlete){
		this.athlete = athlete;
	}
	
	@Override
	public String getFirstName() {
		
		String[] nameParts =  athlete.getFullName().split(" ");
		return nameParts[0];
	}

	@Override
	public String getLastName() {
		String[] nameParts =  athlete.getFullName().split(" ");
		return nameParts[nameParts.length - 1];
	}

	@Override
	public String getEntireStatLine() {

		Map<String, Object> stats = athlete.getStats();
		StringBuilder builder = new StringBuilder();
		
		for (String type : stats.keySet()) {
			Object value = stats.get(type);
			
			builder.append(type);
			builder.append(" : ");
			builder.append(value);
			builder.append("\n");
		}
		
		return builder.toString();
	}

	
}
