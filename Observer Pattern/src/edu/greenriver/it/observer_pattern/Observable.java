package edu.greenriver.it.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Observable(){
		//do nothing
	}
	
	//methods
	public void addObserver(Observer observer){
		//quietly ignore duplicates
		if (!observers.contains(observer)){
			observers.add(observer);
		}
		
	}
	
	public void deleteObserver(Observer observer){
		observers.remove(observer);
		
	}
	
	public void notifyObservers(){
		notifyObservers(null);
}
	
	public void notifyObservers(Object arguments){
		
		//loop over my observers
		for (Observer observer : observers){
			observer.update(this, arguments);
		}
	}
}

