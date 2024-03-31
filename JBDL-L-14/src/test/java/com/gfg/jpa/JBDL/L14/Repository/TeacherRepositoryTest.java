package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Course;
import com.gfg.jpa.JBDL.L14.Model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Test
    public void oneToManyExample(){
        Course DSA = new Course();
        DSA.setId(4);
        DSA.setCourseId(5);
        DSA.setCourseName("Java Course");

        Course AWS = new Course();
        AWS.setCourseName("AWS Course");
        AWS.setCourseId(3);
        AWS.setId(2);

        List<Course> course = Arrays.asList(DSA,AWS);

        Teacher teacher = new Teacher();
        teacher.setTeacherId(5);
        teacher.setId(1);
        teacher.setName("Rajiv");

        teacherRepository.save(teacher);

        System.out.println("Data Has been saved");
    }

}