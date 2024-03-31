package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Course;
import com.gfg.jpa.JBDL.L14.Model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherCourseTest {

    @Autowired
    TeacherCourse teacherCourse;

    @Test
    public void ManyToOneMappingExample(){
        Teacher teacher = new Teacher();
        teacher.setName("Akshay");
        teacher.setId(12);
        teacher.setTeacherId(6);

        Course MERN = new Course();
        MERN.setId(4);
        MERN.setCourseId(5);
        MERN.setCourseName("MERN Course");
        MERN.setTeacher(teacher);

        Course mean = new Course();
        mean.setCourseName("mean Course");
        mean.setCourseId(3);
        mean.setId(2);
        mean.setTeacher(teacher);

        teacherCourse.save(MERN);
        System.out.println("Data Has been saved successfully");

    }

}