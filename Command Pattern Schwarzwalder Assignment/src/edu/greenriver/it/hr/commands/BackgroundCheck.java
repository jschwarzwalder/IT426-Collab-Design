/**
 * Jami Schwarzwalder
 * Nov 5, 2016
 * BackgroundCheck.java
 * Asks the OfficeStaff class to run a background check
 */
package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.OfficeStaff;
import edu.greenriver.it.hr.employees.Employee;

/**
 * Asks the OfficeStaff class to run a background check
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class BackgroundCheck extends HRCommand {
	

	/**
	 * 
	 * @see edu.greenriver.it.hr.commands.HRCommand#execute()
	 */
	@Override
	public void execute() {
		OfficeStaff.backgroundCheck(getReciever());
		
	}

}
