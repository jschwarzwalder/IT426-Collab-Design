package edu.greenriver.it.test_commands;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import edu.greenriver.it.commands.DropCommand;
import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.commands.RegisterCommand;
import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public class RegistrationDriver 
{
	private static Queue<ICommand> commandQueue = new LinkedBlockingQueue<ICommand>();
	private static Stack<ICommand> undoStack = new Stack<ICommand>();
	private static Scanner console = new Scanner(System.in);
	
	//students & classes
	private static GRClass[] classes;
	private static Student[] students;
	
	public static void main(String[] args) 
	{
		//show current students/classes
		classes = getClasses();
		students = getStudents();
		
		printStudentsClasses();
		
		while (true)
		{
			chooseFromMenu();
		}
	}
	
	public static void chooseFromMenu()
	{
		//print out the commands available
		CommandType[] commands = CommandType.values();
		for (int i = 0; i < commands.length; i++)
		{
			System.out.println((i + 1) + ": " + commands[i]);
		}
		
		System.out.println("x: execute command queue");
		System.out.println("z: undo last command");
		
		//execute the choice!
		String choice = console.nextLine();
		switch(choice)
		{
			case "1":
				queueNewRegistration();
				break;
			case "2":
				queueNewDrop();
				break;
			case "x":
				executeCommandQueue();
				break;
			case "z":
				undoCommand();
				break;
		}
	}
	
	public static void undoCommand()
	{
		if (!undoStack.isEmpty())
		{
			ICommand command = undoStack.pop();
			command.unexecute();
		}
		else
		{
			System.out.println("Nothing to undo...");
		}
	}
	
	public static void executeCommandQueue()
	{
		//clear the queue and execute each command
		while (!commandQueue.isEmpty())
		{
			//pull off the command
			ICommand command = commandQueue.remove();
			
			//put this on an "undo" stack...
			undoStack.push(command);
			
			//execute the command
			command.execute();
		}
	}
	
	public static void queueNewDrop()
	{
		//find/validate choices
		Student chosenStudent = getStudentChoice();
		GRClass chosenClass = getClassChoice();
		
		//queue up a command to register that student
		commandQueue.add(new DropCommand(chosenStudent, chosenClass));
	}
	
	public static void queueNewRegistration()
	{
		//find/validate choices
		Student chosenStudent = getStudentChoice();
		GRClass chosenClass = getClassChoice();
		
		//queue up a command to register that student
		commandQueue.add(new RegisterCommand(chosenStudent, chosenClass));
	}
	
	public static GRClass getClassChoice()
	{
		System.out.print("Enter a class name: ");
		String className = console.nextLine();
		
		return getClassByName(className);
	}
	
	public static Student getStudentChoice()
	{
		//ask the user for a student and class
		System.out.print("Enter a student: ");
		String studentName = console.nextLine();
		
		return getStudentByName(studentName);
	}
	
//	public static String[] getStudentClassChoice()
//	{
//		//ask the user for a student and class
//		System.out.print("Enter a student: ");
//		String studentName = console.nextLine();
//		
//		System.out.print("Enter a class name: ");
//		String className = console.nextLine();
//		
//		return new String[] {studentName, className};
//	}
	
	public static GRClass getClassByName(String name)
	{
		for (int i = 0; i < classes.length; i++)
		{
			if (classes[i].getName().equalsIgnoreCase(name))
			{
				return classes[i];
			}
		}
		return null;
	}
	
	public static Student getStudentByName(String name)
	{
		for (int i = 0; i < students.length; i++)
		{
			if (students[i].getName().equalsIgnoreCase(name))
			{
				return students[i];
			}
		}
		return null;
	}
	
	public static void printStudentsClasses()
	{
		System.out.print("Classes: ");
		for (int i = 0; i < classes.length; i++)
		{
			System.out.print(classes[i].getName() + " ");
		}
		System.out.println(); //newline
		
		System.out.print("Students: ");
		for (int i = 0; i < students.length; i++)
		{
			System.out.print(students[i].getName() + " ");
		}
		System.out.println(); //newline
	}
	
	public static GRClass[] getClasses()
	{
		return new GRClass[] {new GRClass("TC 120", 4, "IT 426"),
				new GRClass("TC 120", 4, "IT 301"),
				new GRClass("KC 309", 4, "IT 333")};
	}
	
	public static Student[] getStudents()
	{
		return new Student[] {new Student("Sarah"), new Student("Linda"), 
				              new Student("Bob"), new Student("Alex"), 
				              new Student("Josh")};
	}
	
	public static void firstTest()
	{
		//create a class with students and practice registrations
		//and drops
		GRClass it426 = new GRClass("TC 120", 4, "IT 426");
		String[] students = {"Sarah", "Linda", "Bob", "Alex", "Josh"};
		ICommand[] commands = new ICommand[students.length];
	
		//simulate time and actions
		for (int i = 0; i < students.length; i++)
		{
			Student student = new Student(students[i]);
			commands[i] = new RegisterCommand(student, it426);
		}
		
		//perform my actions
		for (int i = 0; i < commands.length; i++)
		{
			commands[i].execute();
		}
		
		//what does our class look like?
		System.out.println(it426.getRegisteredStudents());
		System.out.println(it426.getWaitListedStudents());
	}
}
