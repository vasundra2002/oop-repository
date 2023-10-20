package com.oop.test;

public class Employee1 {
	
	 public int id;
	    public String name;
	    public String city;
	    public double salary;
	    
	    public Employee1()
	    {
	        
	    }

	    public Employee1(int id, String name, String city, double salary) {

	        this.id = id;
	        this.name = name;
	        this.city = city;
	        this.salary = salary;
	    }
	    
	    public void display()
	    {
	        System.out.println("Employee Id:"+this.id);
	        System.out.println("Employee Name:"+this.name);
	        System.out.println("Employee City:"+this.city);
	        System.out.println("Employee Salary:"+this.salary);
	    }
	    
	    

}
