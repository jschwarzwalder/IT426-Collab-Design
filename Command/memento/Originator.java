package edu.greenriver.it.memento;

public abstract class Originator 
{
	public abstract IMemento createMemento();
	public abstract void setMemento(IMemento memento);
}
