package edu.greenriver.it.commands;

import edu.greenriver.it.students.GRClass;
import edu.greenriver.it.students.Student;

public abstract class EnrollmentCommand implements ICommand {
	// receiver? encapsulated?
	protected Student studentReceiver;
	protected GRClass classReceiver;

	// marks whether the command had an effect or not?!?!
	protected boolean somethingHappened = false;

	public EnrollmentCommand(Student studentReceiver, GRClass classReceiver) {
		this.studentReceiver = studentReceiver;
		this.classReceiver = classReceiver;
	}

	public void register() {
		if (!classReceiver.hasStudent(studentReceiver)) {
			somethingHappened = true;

			classReceiver.addStudent(studentReceiver);
			System.out.println(studentReceiver.getName() + " registered for " + classReceiver.getName());
		}
	}

	public void drop() {
		if (classReceiver.hasStudent(studentReceiver)) {
			somethingHappened = true;

			classReceiver.removeStudent(studentReceiver);
			System.out.println(studentReceiver.getName() + " dropped from " + classReceiver.getName());
		}
	}
}
