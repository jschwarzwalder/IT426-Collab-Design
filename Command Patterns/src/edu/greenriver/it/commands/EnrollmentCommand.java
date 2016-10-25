package edu.greenriver.it.commands;

import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public abstract class EnrollmentCommand implements ICommand {
	
	//Receiver? encapsulated?
	protected Student studentReciever;
	protected GRClass classReciever;
	
	
	public EnrollmentCommand(Student studentReciever, GRClass classReciever) {
		
		this.studentReciever = studentReciever;
		this.classReciever = classReciever;
	}
		
		

}
