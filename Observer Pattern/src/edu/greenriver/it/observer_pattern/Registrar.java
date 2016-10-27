package edu.greenriver.it.observer_pattern;

import java.time.LocalDateTime;

public class Registrar implements Observer {
	// fields...
	private String name;

	public Registrar(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable observable, Object arguments) {
		Object[] argumentsArray = (Object[]) arguments;
		String message = argumentsArray[0].toString();
		LocalDateTime timestamp = (LocalDateTime) argumentsArray[1];

		System.out
				.println("Student: " + observable.toString() + ", " + message + "(" + timestamp + ") seen by " + name);
	}
}
