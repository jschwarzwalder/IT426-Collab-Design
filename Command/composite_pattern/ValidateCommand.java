package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.students.Student;

public class ValidateCommand  implements ICommand
{
	private Student student;
	
	public ValidateCommand(Student student)
	{
		this.student = student;
	}

	@Override
	public void execute() 
	{
		System.out.println("Validated " + student + "'s data...");
	}

	@Override
	public void unexecute() 
	{
		//do nothing...
	}
}