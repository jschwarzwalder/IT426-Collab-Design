package edu.greenriver.it.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	private boolean changed = false;

	// a default constructor is a good thing!
	public Observable() {
		// do nothing
	}

	// methods...
	public void setChanged() {
		changed = true;
	}

	public void addObserver(Observer observer) {
		// quietly ignore duplicates
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Object arguments) {
		if (changed) {
			// loop over my observers
			for (Observer observer : observers) {
				observer.update(this, arguments);
			}

			changed = false;
		}
	}
}
