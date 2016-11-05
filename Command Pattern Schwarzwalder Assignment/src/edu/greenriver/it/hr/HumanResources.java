package edu.greenriver.it.hr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import edu.greenriver.it.hr.commands.HRCommand;
import edu.greenriver.it.hr.employees.Employee;

public class HumanResources
{
    //list of commands to complete (first come, first serve)
    private List<HRCommand> todos = new ArrayList<HRCommand>();
    
    //list of Employees
    private Map<String, Employee> namesToApplicants = new TreeMap<String, Employee>();
    
    //public methods 
    
    public void testHiringProcess()
    {
        //add command items for adding 10 new applicants to our HR system
        
        //print new employees
    }
    
    public void addApplicant(Employee employee)
    {
        namesToApplicants.put(employee.getName(), employee);
    }
}
