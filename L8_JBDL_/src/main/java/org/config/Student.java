package org.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
    @Value("12")
    String id;
    @Value("#{T(java.lang.Maths).sqrt(2)}")
    String sum;
    Student(){}

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sum=" + sum +
                '}';
    }
}
