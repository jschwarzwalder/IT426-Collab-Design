package edu.greenriver.it.memento;

import edu.greenriver.it.commands.RegisterCommand;
import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.GRClass.GRClassMemento;
import edu.greenriver.it.students.Student;

public class MementoTest 
{
	public static void main(String[] args) 
	{
		GRClass classroom = new GRClass("TC 120", 30, "IT 426");
		Student rose = new Student("Rose");
		Student bobby = new Student("Bobby");
		
		GRClassMemento snapshot = classroom.createMemento();
		
		//make some changes
		new RegisterCommand(rose, classroom).execute();
		new RegisterCommand(bobby, classroom).execute();
		
		//see the changes
		System.out.println("Class: " + classroom);
		
		//rollback to an old state
		classroom.setMemento(snapshot);
		System.out.println("Class: " + classroom);
		
	}
}
