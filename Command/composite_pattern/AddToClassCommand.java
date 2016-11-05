package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.students.Student;

public class AddToClassCommand implements ICommand
{
	private Student student;
	
	public AddToClassCommand(Student student)
	{
		this.student = student;
	}

	@Override
	public void execute() 
	{
		System.out.println(student + " was added to thier class roster...");
	}

	@Override
	public void unexecute() 
	{
		//do nothing...
	}
}
