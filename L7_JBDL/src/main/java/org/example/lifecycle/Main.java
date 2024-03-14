package org.example.lifecycle;

import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/example/boxconfig.xml");
        Box2 b = (Box2) applicationContext.getBean("box2");
        applicationContext.registerShutdownHook();
        System.out.println(b);

    }
}
