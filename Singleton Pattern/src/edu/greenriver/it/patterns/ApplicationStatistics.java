package edu.greenriver.it.patterns;

import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class ApplicationStatistics 
{
	//fields (data)
	private int numberOfObjectsCreated;
	private LocalDateTime appStartTime;
	private LocalDateTime appEndTime;
	
	//singleton...
	private static ApplicationStatistics instance;
	
	//constructors
	private ApplicationStatistics()
	{
		//do nothing
	}
	
	//methods...
	public static ApplicationStatistics getInstance()
	{
		//lazy init...
		if (instance == null)
		{
			synchronized (ApplicationStatistics.class)
			{
				if (instance == null)
				{
					instance = new ApplicationStatistics();
					System.out.println("Creating the singleton object!");
				}
			}
		}
		
		return instance;
	}
	
	public void startApp()
	{
		appStartTime = LocalDateTime.now();
	}
	
	public void endApp()
	{
		appEndTime = LocalDateTime.now();
	}
	
	public void objectCreated()
	{
		numberOfObjectsCreated++;
	}

	@Override
	public String toString() {
		return "ApplicationStatistics [numberOfObjectsCreated="
				+ numberOfObjectsCreated + ", appStartTime=" + appStartTime
				+ ", appEndTime=" + appEndTime + "]";
	}
}
