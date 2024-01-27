package Polymorphism;

public class Child extends Parent{
    @Override
    public void m1(){
        System.out.println("Inside Child Method");
    }
    public void m2(){
        System.out.println("Inside m2()");
    }
    @Override
    public void m2Parent(int age){

    }
}
