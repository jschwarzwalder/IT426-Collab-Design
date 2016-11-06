package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.employees.Employee;

public abstract class HRCommand {
	private Employee employeeReciever;
	
	public abstract void execute();

	public Employee getReciever() {
		return employeeReciever;
	}

	public void setReciever(Employee reciever) {
		this.employeeReciever = reciever;
	}
	
	

}
