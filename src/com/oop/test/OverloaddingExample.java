package com.oop.test;
class Helper
{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    
    public double multiply(double a,double b)
    {
        return a*b;
    }
    
    public double multiply(float a,float b)
    {
        return a*b;
    }
    
    public double multiply(double a,double b,double c)
    {
        return a*b*c;
    }
}
public class OverloaddingExample {

	public static void main(String[] args) {
		Helper helper=new Helper();
		System.out.println(helper.multiply(10,20));
		

	}

}
