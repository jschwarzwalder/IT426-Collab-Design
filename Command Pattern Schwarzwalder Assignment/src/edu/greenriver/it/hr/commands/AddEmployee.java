/**
 * Jami Schwarzwalder
 * Nov 5, 2016
 * AddEmployee.java
 * Adds the employee to the human resources system
 */
package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.HumanResources;
import edu.greenriver.it.hr.employees.Employee;

/**
 * Adds the employee to the human resources system
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class AddEmployee extends HRCommand {
	
	private Employee employeeReciever;
	private HumanResources humanResourcesReciever;
	/**
	 * 
	 * @see edu.greenriver.it.hr.commands.HRCommand#execute()
	 */
	@Override
	public void execute() {
		humanResourcesReciever.addApplicant(employeeReciever);
		
	}

}
