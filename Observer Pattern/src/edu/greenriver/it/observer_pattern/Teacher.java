package edu.greenriver.it.observer_pattern;

import java.time.LocalDateTime;

public class Teacher implements Observer {
	private String name;
	private String[] classes;

	public Teacher(String name, String[] classes) {
		this.name = name;
		this.classes = classes;
	}

	@Override
	public void update(Observable observable, Object arguments) {
		Object[] argumentsArray = (Object[]) arguments;
		String className = argumentsArray[2].toString();

		for (int i = 0; i < classes.length; i++) {
			if (classes[i].equals(className)) {
				System.out.println(observable.toString() + " was register for my class (" + name + ")");
			}
		}
	}
}
