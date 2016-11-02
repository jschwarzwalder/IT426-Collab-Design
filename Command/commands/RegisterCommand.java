package edu.greenriver.it.commands;

import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public class RegisterCommand extends EnrollmentCommand
{
	public RegisterCommand(Student studentReceiver, GRClass classReceiver) 
	{
		super(studentReceiver, classReceiver);
	}

	@Override
	public void execute() 
	{
		register();
	}
	
	@Override
	public void unexecute()
	{
		if (somethingHappened)
		{
			drop();
		}
	}
}
