package org.example.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/example/autoconfig.xml");
        A a = applicationContext.getBean("a",A.class);
        System.out.println(a);
    }
}
