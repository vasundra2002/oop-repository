package com.oop.test;

interface Callable
{
    void call();
}

interface Runnable
{
    void run();
}

class AbleImpl implements Callable, Runnable
{

    @Override
    public void run() {
        
        System.out.println("I can call");
        
    }

    @Override
    public void call() {
        System.out.println("I can run");
        
    }
    
}


public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {
        AbleImpl ableImpl=new AbleImpl();
        ableImpl.call();
        ableImpl.run();
        
    }

}