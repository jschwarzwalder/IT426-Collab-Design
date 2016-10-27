package edu.greenriver.it.observer_pattern;

public class TestObserverPattern {
	public static void main(String[] args) {
		// observables...
		Student andriy = new Student("andriy");
		Student alexO = new Student("alex onorati");

		// observers
		Registrar staffOne = new Registrar("susie");
		Registrar staffTwo = new Registrar("stan");
		Teacher josh = new Teacher("josh", new String[] { "IT 301", "IT 426" });

		// add observers to observable
		andriy.addObserver(staffOne);
		andriy.addObserver(staffTwo);
		andriy.addObserver(josh);

		// do something interesting (noteworthy) with an observable
		andriy.registerForClass("IT 426", "Winter 2016");
	}
}
