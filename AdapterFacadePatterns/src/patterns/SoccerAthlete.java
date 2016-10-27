package edu.greenriver.it.patterns;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SoccerAthlete 
{
	//track the name and stats for a soccer athlete
	private String fullname;
	private Map<String, Object> stats = new HashMap<String, Object>();
	
	public SoccerAthlete(String fullname)
	{
		this.fullname = fullname;
	}
	
	public void addStatLine(String type, Object value)
	{
		stats.put(type, value);
	}
	
	public Map<String, Object> getStats()
	{
		return Collections.unmodifiableMap(stats);
	}
	
	public String getFullName()
	{
		return fullname;
	}
}
