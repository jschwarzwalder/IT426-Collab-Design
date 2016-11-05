package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.students.Student;

public class EmailCommand implements ICommand
{
	private Student student;
	
	public EmailCommand(Student student)
	{
		this.student = student;
	}

	@Override
	public void execute() 
	{
		System.out.println("Sent email to ... " + student);
	}

	@Override
	public void unexecute() 
	{
		//do nothing...
	}
}
