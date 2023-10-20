package com.oop.test;

public class Employee {
	 //Data members
    public long employeeId;
    public String employeeName;
    public String designation;
    public int leaveBalance;
    public double salary;
    
    //Methods
    public void applyLeave()
    {
        
        System.out.println("Leave appied");
    }
    
    public void login()
    {
        System.out.println("Employee logged in");
    }
    
    public void loggedOut()
    {
        System.out.println("Employee logged out");
    }
    
    public void drawSalary()
    {
        System.out.println("Salary credited");
    }
    

}
