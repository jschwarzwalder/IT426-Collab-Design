package edu.greenriver.it.observer_pattern;

public interface Observer {
	public void update(Observable observable, Object argument);
	public void update(Observable observable);
}
