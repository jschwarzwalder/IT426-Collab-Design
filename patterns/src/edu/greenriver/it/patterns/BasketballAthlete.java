package edu.greenriver.it.patterns;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BasketBallAthlete 
{
	private String fname;
	private String lname;
	private Set<Stat> stats = new HashSet<Stat>();
	
	public BasketBallAthlete(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	
	public void addANewStat(Stat stat)
	{
		stats.add(stat);
	}
	
	public String getFname() 
	{
		return fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public Set<Stat> getStats() 
	{
		return Collections.unmodifiableSet(stats);
	}

	public static class Stat
	{
		private String type;
		private Object value;
		
		public Stat(String type, Object value) 
		{
			this.type = type;
			this.value = value;
		}

		public String getType() 
		{
			return type;
		}

		public Object getValue() 
		{
			return value;
		}
	}
}
