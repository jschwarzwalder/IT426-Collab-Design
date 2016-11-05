package edu.greenriver.it.memento;

import java.util.List;

import edu.greenriver.it.commands.RegisterCommand;
import edu.greenriver.it.composite_pattern.CompositeCommand;
import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.GRClass.GRClassMemento;
import edu.greenriver.it.students.Student;

public class TransactionCommand extends CompositeCommand
{
	private GRClass classroom;
	private List<Student> studentsToRegister;

	public TransactionCommand(GRClass classroom,
			List<Student> studentsToRegister) 
	{
		this.classroom = classroom;
		this.studentsToRegister = studentsToRegister;
		
		//create commands
		for (Student student : studentsToRegister)
		{
			this.addCommand(new RegisterCommand(student, classroom));
		}
	}

	@Override
	public void execute() 
	{
		//save a snapshot of the class
		GRClassMemento memento = classroom.createMemento();
		
		try
		{
			super.execute();
		}
		catch (Exception ex)
		{
			//something went wrong... (rollback our changes)
			classroom.setMemento(memento);
		}
	}

	@Override
	public void unexecute() 
	{
		
	}

}
