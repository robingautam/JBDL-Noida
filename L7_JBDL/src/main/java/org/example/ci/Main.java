package org.example.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/studentconfigCons.xml");
        Employee e = context.getBean("emp",Employee.class);
        System.out.println(e);
    }
}
