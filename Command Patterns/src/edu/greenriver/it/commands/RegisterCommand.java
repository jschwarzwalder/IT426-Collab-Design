package edu.greenriver.it.commands;

import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public class RegisterCommand extends EnrollmentCommand {

	
	

	public RegisterCommand(Student studentReciever, GRClass classReciever) {
		super(studentReciever, classReciever);
	}
	
	@Override
	public void execute() {
		if(!classReciever.hasStudent(studentReciever)){
			classReciever.addStudent(studentReciever);
		}

	}
	

}
