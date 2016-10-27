package edu.greenriver.it.observer_pattern;

import java.time.LocalDateTime;

public class Student extends Observable {
	// fields...
	private String name;

	// constructors...
	public Student(String name) {
		this.name = name;
	}

	public void registerForClass(String className, String yearQuarter) {
		// register...
		this.setChanged();
		this.notifyObservers(new Object[] { "registration added", LocalDateTime.now(), className, yearQuarter });
	}

	@Override
	public String toString() {
		return name;
	}
}
