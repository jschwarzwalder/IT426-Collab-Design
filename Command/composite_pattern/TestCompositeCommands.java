package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.students.Student;

public class TestCompositeCommands
{
	public static void main(String[] args) 
	{
		Student student1 = new Student("Jose");
		Student student2 = new Student("Steve");
		Student student3 = new Student("Ashley");
		
		CompositeCommand registrations = new CompositeCommand();
		
		registrations.addCommand(registerStudent(student1));
		registrations.addCommand(registerStudent(student2));
		registrations.addCommand(registerStudent(student3));
		
		registrations.execute();
	}
	
	public static ICommand registerStudent(Student student)
	{
		CompositeCommand group = new CompositeCommand();
		
		//add sub commands
		group.addCommand(new ValidateCommand(student));
		group.addCommand(new AddToClassCommand(student));
		group.addCommand(new EmailCommand(student));
		group.addCommand(new AddToCanvasCommand(student));
		
		return group;
	}
}
