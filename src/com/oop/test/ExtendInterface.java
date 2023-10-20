package com.oop.test;

interface A1
{
    void method1();
    void method2();
}


interface B1 extends A1
{
    void method3();

}

class Impl implements B1
{

    @Override
    public void method1() {
        
        System.out.println("Method 1");
        
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
        
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
        
    }
    
}

public class ExtendInterface {

    public static void main(String[] args) {
        Impl impl=new Impl();
        impl.method1();
        impl.method2();
        impl.method3();
        
    }

}