package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Student {

    @Autowired
            @Qualifier("address3")
    Address address;
    Student(){}

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
