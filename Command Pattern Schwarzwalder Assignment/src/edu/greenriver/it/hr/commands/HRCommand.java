package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.employees.Employee;

public abstract class HRCommand {
	private Employee reciever;
	
	public abstract void execute();

}
