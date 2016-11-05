package edu.greenriver.it.hr;

import edu.greenriver.it.hr.employees.Employee;
import edu.greenriver.it.hr.employees.EmployeeType;

public class OfficeStaff
{
    //private static Random random = new Random();
    
    public static void backgroundCheck(Employee employee)
    {
        //100% chance to come back "good"
    }
    
    public static void referenceCheck(Employee employee)
    {
        //100% chance to be a good reference
    }
    
    public static void changeEmployeeStatus(Employee employee, EmployeeType type)
    {
        employee.setType(type);
    }
}
