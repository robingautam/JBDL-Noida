package Polymorphism;

public class Main {
    public static void main(String[] args) {
        //System.out.println(add(2,3,4));
        //Person p = new Customer();
        //p.behave();
        long l1 = 23;
        long l2 = 24;
        //System.out.println(add((int) l1,(int)l2));
        Parent p = new Parent();
        p.m1();

        Parent p1 = new Child();
        p.m1();

        Child c1 = new Child();
        c1.m1();
        //Child class reference cant hold parent class Object
     //   Child c2 = new Parent();
       // c2.m2();
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
