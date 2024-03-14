package org.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/stconfig.xml");
        Employee e = context.getBean("employee",Employee.class);
        System.out.println(e);
    }
}
