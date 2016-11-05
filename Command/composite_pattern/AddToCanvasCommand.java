package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.students.Student;

public class AddToCanvasCommand implements ICommand
{
	private Student student;
	
	public AddToCanvasCommand(Student student)
	{
		this.student = student;
	}

	@Override
	public void execute() 
	{
		System.out.println(student + " was added to their canvas course...");
	}

	@Override
	public void unexecute() 
	{
		//do nothing...
	}
}
