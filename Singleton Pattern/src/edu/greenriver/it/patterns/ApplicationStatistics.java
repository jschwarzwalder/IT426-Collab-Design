package edu.greenriver.it.patterns;

import java.time.LocalDateTime;

public class ApplicationStatistics {
	
	//fields (data)
	private int numberofObjectsCreated;
	private LocalDateTime appStartTime;
	private LocalDateTime appEndTime;
	
	//singleton...
	private static ApplicationStatistics instance;
	
	//Constructors
	private ApplicationStatistics(){
		//do nothing
	}
	
	
	//methods..
	
	public static ApplicationStatistics getInstance(){
		
		if(instance == null){
			instance = new ApplicationStatistics();
		}
		
		return instance;
		
	}
	
	public void startApp(){
		appStartTime = LocalDateTime.now();
	}
	
	public void endApp() {
		appEndTime = LocalDateTime.now();
	}
	
	public void objectCreated(){
		numberofObjectsCreated ++;
	}

}
