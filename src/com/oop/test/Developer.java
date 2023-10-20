package com.oop.test;



	public class Developer extends Employee1{
	    
	    public String department;

	    public Developer() {
	        super();
	        
	    }

	    public Developer(int id, String name, String city, double salary, String department) {
	        super(id, name, city, salary);
	        this.department=department;
	    
	    } 
	    
	    public void display()
	    {
	        super.display();
	        System.out.println("Department name:"+this.department);
	    }
	    
	    
	    public static void main(String args[])
	    {
	        Developer developer=new Developer(543543,"Tessa","Chennai",45000,"IT");
	        developer.display();
	    }


}
