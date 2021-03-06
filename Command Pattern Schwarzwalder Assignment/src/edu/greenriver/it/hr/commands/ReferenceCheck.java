/**
 * Jami Schwarzwalder
 * Nov 5, 2016
 * ReferenceCheck.java
 * Asks the OfficeStaff class to check references for an applicant 
 */
package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.OfficeStaff;


/**
 * Asks the OfficeStaff class to check references for an applicant 
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class ReferenceCheck extends HRCommand {
	

	/**
	 * 
	 * @see edu.greenriver.it.hr.commands.HRCommand#execute()
	 */
	@Override
	public void execute() {
		OfficeStaff.referenceCheck(getReciever());
		System.out.println("Starting reference check... success!");
		
	}

}
