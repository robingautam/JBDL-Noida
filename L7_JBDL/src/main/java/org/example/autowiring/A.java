package org.example.autowiring;

public class A {
    B obj;
    A(){}

    public A(B obj) {
        this.obj = obj;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "obj=" + obj +
                '}';
    }
}
