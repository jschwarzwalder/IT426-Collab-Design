package edu.greenriver.it.hr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import edu.greenriver.it.hr.commands.AddEmployee;
import edu.greenriver.it.hr.commands.BackgroundCheck;
import edu.greenriver.it.hr.commands.ChangeEmployeeType;
import edu.greenriver.it.hr.commands.ConsoleOutput;
import edu.greenriver.it.hr.commands.HRCommand;
import edu.greenriver.it.hr.commands.ReferenceCheck;
import edu.greenriver.it.hr.employees.Employee;
import edu.greenriver.it.hr.employees.EmployeeType;

public class HumanResources {
	// list of commands to complete (first come, first serve)
	private List<HRCommand> todos = new ArrayList<HRCommand>();

	// list of Employees
	private Map<String, Employee> namesToApplicants = new TreeMap<String, Employee>();

	//Random for selecting Hourly & Salary employment type
	private Random random = new Random();
	
	// public methods

	public void testHiringProcess() {
		// add command items for adding 5 new applicants to our HR system
		String[] newEmployees = new String[] { "Rory Williams", "Amy Pond", "River Song", "John Watson", "Henry VIII" };
		
		for (int i = 0; i < newEmployees.length; i++) {
			Employee employee = new Employee(newEmployees[i]);

			// Print the name of the applicant
			todos.add(printApplicantName(employee));

			// Run a background check
			todos.add(runBackgroundCheck(employee));

			// Run a reference check
			todos.add(runReferenceCheck(employee));

			// Change the employee type (randomly) to HOURLY or SALARY
			todos.add(randomizeEmployeeType(employee));

			// Add the employee as a new employee
			todos.add(addEmployee(employee));
			
			

		}
		
		for (int i = 0; i < todos.size(); i++){
			todos.get(i).execute();
		}

		// print new employees
		for (Entry<String, Employee> employee: namesToApplicants.entrySet()){
			System.out.println(employee.getValue().toString());
		}

	}

	private HRCommand printApplicantName(Employee employee) {
		ConsoleOutput printName = new ConsoleOutput();
		printName.setMessage("Hiring new employee: " + employee.getName());
		return printName;
	}

	private HRCommand runBackgroundCheck(Employee employee) {
		BackgroundCheck checkBackground = new BackgroundCheck();
		checkBackground.setReciever(employee);
		return checkBackground;
	}

	private HRCommand runReferenceCheck(Employee employee) {
		ReferenceCheck checkReference = new ReferenceCheck();
		checkReference.setReciever(employee);
		return checkReference;
	}

	private HRCommand randomizeEmployeeType(Employee employee) {
		ChangeEmployeeType setNewEmployeeType = new ChangeEmployeeType();
		setNewEmployeeType.setReciever(employee);
		Boolean salaryEmployee = random.nextBoolean();
		if (salaryEmployee) {
			setNewEmployeeType.setEmployeeType(EmployeeType.SALARY);
		} else {
			setNewEmployeeType.setEmployeeType(EmployeeType.HOURLY);
		}
		return setNewEmployeeType;
	}

	private HRCommand addEmployee(Employee employee) {
		AddEmployee addNewEmployee = new AddEmployee();
		addNewEmployee.setReciever(employee);
		addNewEmployee.setHumanResourcesReciever(this);
		return addNewEmployee;
	}

	public void addApplicant(Employee employee) {
		namesToApplicants.put(employee.getName(), employee);
	}
}
