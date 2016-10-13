package edu.greenriver.it.observer_pattern;

public class TestObserverPattern {
	
	public static void main(String[] args){
		
		//observables
		Student andriy = new Student();
		Student alex0 = new Student();
		
		//observers
		Registrar staffOne = new Registrar();
		Registrar staffTwo = new Registrar();
		
		//add observers to observable
		andriy.addObserver(staffOne);
		andriy.addObserver(staffTwo);
		
		//do somthing intersting(noteworithy) with an observables
		andriy.registerForClass("IT485", "Winter 2017");
	}

}
