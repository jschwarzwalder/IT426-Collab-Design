package edu.greenriver.it.observer_pattern;

import java.time.LocalDateTime;

public class Registrar implements Observer{
	
	@Override
	public void update(Observable observable, Object arguments){
		Object[] argumentsArray = (Object[])arguments;
		String message = argumentsArray[0].toString();
		LocalDateTime timestamp = (LocalDateTime)argumentsArray[1];
		
		System.out.println("Student: " + observable.toString() + ". " + "(" + timestamp + ")" );
	}

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub
		
	}

}
