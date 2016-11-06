/**
 * Jami Schwarzwalder
 * Nov 5, 2016
 * ConsoleOutput.java
 * Prints a message to the console during the hiring process
 */
package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.employees.Employee;

/**
 * Prints a message to the console during the hiring process
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class ConsoleOutput extends HRCommand {
	private Employee reciever;

	/**
	 * 
	 * @see edu.greenriver.it.hr.commands.HRCommand#execute()
	 */
	@Override
	public void execute() {
		System.out.println(reciever.getName());
		
	}

}
