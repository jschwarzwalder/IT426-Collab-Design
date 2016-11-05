package edu.greenriver.it.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.greenriver.it.memento.IMemento;

public class GRClass
{
	private String location;
	private int totalSeats;
	private String name;
	
	private List<Student> registeredStudents = new ArrayList<Student>();
	private List<Student> waitListedStudents = new ArrayList<Student>();
	
	public GRClass(String location, int totalSeats, String name) 
	{
		this.location = location;
		this.totalSeats = totalSeats;
		this.name = name;
	}
	
	public void addStudent(Student student)
	{
		if (hasStudent(student))
		{
			throw new IllegalArgumentException("Student is already in the class!");
		}
		
		if (registeredStudents.size() == totalSeats)
		{
			waitListedStudents.add(student);
		}
		else
		{
			registeredStudents.add(student);
		}
	}
	
	public boolean hasStudent(Student student)
	{
		return registeredStudents.contains(student) || 
				waitListedStudents.contains(student);
	}
	
	public void removeStudent(Student student)
	{
		if (!hasStudent(student))
		{
			throw new IllegalArgumentException("Student is already in the class!");
		}
		
		//the student is in one or the other...
		if (waitListedStudents.contains(student))
		{
			waitListedStudents.remove(student);
		}
		else
		{
			registeredStudents.remove(student);
		}
	}

	public List<Student> getRegisteredStudents() 
	{
		return Collections.unmodifiableList(registeredStudents);
	}

	public List<Student> getWaitListedStudents() 
	{
		return Collections.unmodifiableList(waitListedStudents);
	}

	public String getLocation() 
	{
		return location;
	}

	public int getTotalSeats() 
	{
		return totalSeats;
	}

	public String getName() 
	{
		return name;
	}

	@Override
	public String toString() 
	{
		return "GRClass [location=" + location + ", totalSeats=" + totalSeats
				+ ", name=" + name + "] registered: " + registeredStudents.toString();
	}

	public GRClassMemento createMemento() 
	{
		GRClassMemento memento = new GRClassMemento();
		
		//save my internal state
		memento.setData("location", location); //normally this is not necessary unless mutable
		memento.setData("totalSeats", totalSeats);
		memento.setData("name", name);
		
		memento.setData("registeredStudents", generateCopy(registeredStudents));
		memento.setData("waitListedStudents", generateCopy(waitListedStudents));
		
		return memento;
	}
	
	private List<Student> generateCopy(List<Student> students)
	{
		//copy over the list of students
		List<Student> copy = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++)
		{
			copy.add(students.get(i));
		}
		return copy;
	}

	@SuppressWarnings("unchecked")
	public void setMemento(GRClassMemento memento) 
	{
		//set my fields here...
		this.location = memento.getData("location").toString();
		this.totalSeats = Integer.parseInt(memento.getData("totalSeats").toString());
		this.name = memento.getData("name").toString();
		
		registeredStudents = (List<Student>)memento.getData("registeredStudents");
		waitListedStudents = (List<Student>)memento.getData("waitListedStudents");
	}
	
	public static class GRClassMemento implements IMemento
	{
		private Map<String, Object> data = new HashMap<String, Object>();
		
		private GRClassMemento()
		{
			//do nothing...
		}
		
		private void setData(String key, Object value) 
		{
			data.put(key, value);
		}

		private Object getData(String key) 
		{
			if (!data.containsKey(key))
			{
				throw new IllegalArgumentException("Cannot find key: " + key);
			}
			
			return data.get(key);
		}
	}
}
