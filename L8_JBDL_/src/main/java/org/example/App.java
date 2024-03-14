package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/config.xml");
        Student st = context.getBean("student",Student.class);
        Student s2 = context.getBean("student",Student.class);
        System.out.println(st.hashCode());
        System.out.println(s2.hashCode());
    }
}
