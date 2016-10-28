package edu.greenriver.it.students;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class GRClass {
	private String location;
	private int totalSeats;
	private String name;

	private List<Student> registeredStudents = new LinkedList<Student>();
	private List<Student> waitListedStudents = new LinkedList<Student>();

	public GRClass(String location, int totalSeats, String name) {
		this.location = location;
		this.totalSeats = totalSeats;
		this.name = name;
	}

	public void addStudent(Student student) {
		if (hasStudent(student)) {
			throw new IllegalArgumentException("Student is already in the class!");
		}

		if (registeredStudents.size() == totalSeats) {
			waitListedStudents.add(student);
		} else {
			registeredStudents.add(student);
		}
	}

	public boolean hasStudent(Student student) {
		return registeredStudents.contains(student) || waitListedStudents.contains(student);
	}

	public void removeStudent(Student student) {
		if (!hasStudent(student)) {
			throw new IllegalArgumentException("Student is already in the class!");
		}

		// the student is in one or the other...
		if (waitListedStudents.contains(student)) {
			waitListedStudents.remove(student);
		} else {
			registeredStudents.remove(student);
		}
	}

	public List<Student> getRegisteredStudents() {
		return Collections.unmodifiableList(registeredStudents);
	}

	public List<Student> getWaitListedStudents() {
		return Collections.unmodifiableList(waitListedStudents);
	}

	public String getLocation() {
		return location;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "GRClass [location=" + location + ", totalSeats=" + totalSeats + ", name=" + name + "]";
	}
}
