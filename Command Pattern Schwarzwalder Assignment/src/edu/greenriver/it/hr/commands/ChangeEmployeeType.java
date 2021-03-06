/**
 * Jami Schwarzwalder
 * Nov 5, 2016
 * ChangeEmployeeType.java
 * Changes the receiver type to either HOURLY or SALARY
 */
package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.employees.EmployeeType;

/**
 * Changes the receiver type to either HOURLY or SALARY
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class ChangeEmployeeType extends HRCommand {

	private EmployeeType employeeType;

	/**
	 * 
	 * @see edu.greenriver.it.hr.commands.HRCommand#execute()
	 */
	@Override
	public void execute() {

		getReciever().setType(employeeType);
		System.out.println("Employee status changed to " + employeeType);

	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

}
