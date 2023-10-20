package com.oop.test;

public class Circle {
	public double radius=1.0;
	public String color="red";
	public Circle() {
		
	}
	public Circle(double radius,String color) {
	this.radius=radius;
		this.color=color;
	}
	public double getradius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.getradius();
		circle.getArea();
		System.out.println(circle.getradius());
		System.out.println(circle.getArea());

	}

}
