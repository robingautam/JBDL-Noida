package Functional;

public interface Parent1 {
    default void m1(){
        System.out.println("Hello");
    }
    void m2();
    void m3();
}
