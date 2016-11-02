package edu.greenriver.it.commands;

import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public class DropCommand extends EnrollmentCommand 
{
	public DropCommand(Student studentReceiver, GRClass classReceiver) 
	{
		super(studentReceiver, classReceiver);
	}

	@Override
	public void execute() 
	{
		drop();
	}
	
	@Override
	public void unexecute()
	{
		if (somethingHappened)
		{
			register();
		}
	}
}
