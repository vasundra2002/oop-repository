package com.oop.test;

public class EmployeeAccess {

	public static void main(String[] args) {
		//Instantiation is the process of creating object or instance of the class
        Employee employee=new Employee();
        
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
	}

}
