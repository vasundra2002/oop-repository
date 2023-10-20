package com.oop.test;

public class ConstructorAccess {

	public static void main(String[] args) {
		//Instantiation is the process of creating object or instance of the class
		ConstructorExample employee=new ConstructorExample();
        
        employee.employeeId=3984;
        employee.employeeName="Mr. Asif";
        employee.leaveBalance=24;
        employee.salary=45000;
        employee.designation="Sr. Manager";
        
        System.out.println(employee.employeeId);
        System.out.println(employee.employeeName);
        System.out.println(employee.leaveBalance);
        System.out.println(employee.salary);
        System.out.println(employee.designation);
        employee.applyLeave();
        employee.drawSalary();
        employee.login();
        employee.loggedOut();
        
        System.out.println("=================================================");
        
        ConstructorExample employee1=new ConstructorExample(1233, "Mr. Aman", "Developer", 40, 50000);
        System.out.println(employee1.employeeId);
        System.out.println(employee1.employeeName);
        System.out.println(employee1.leaveBalance);
        System.out.println(employee1.salary);
        System.out.println(employee1.designation);
        employee1.applyLeave();
        employee1.drawSalary();
        employee1.login();
        employee1.loggedOut();
        
        
        System.out.println("=================================================");
        
        ConstructorExample employee2=new ConstructorExample(employee1);
        System.out.println(employee1.employeeId);
        System.out.println(employee1.employeeName);
        System.out.println(employee1.leaveBalance);
        System.out.println(employee1.salary);
        System.out.println(employee1.designation);
        employee2.applyLeave();
        employee2.drawSalary();
        employee2.login();
        employee2.loggedOut();
        

	}

}
