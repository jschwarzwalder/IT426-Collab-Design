package edu.greenriver.it.observer_pattern;

import java.time.LocalDateTime;

public class Student extends Observable {
	
	//fields
	
	//constructors

	public void registerForClass(String className, String yearQuarter) {
		
		//register
		this.notifyObservers(new Object[] {"registration added", LocalDateTime.now()});
	}
}
