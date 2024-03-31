package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Course;
import com.gfg.jpa.JBDL.L14.Model.CourseDetail;
import com.gfg.jpa.JBDL.L14.Model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void oneToOneMappingExample(){
        Course java = new Course();
        java.setId(1);
        java.setCourseId(1);
        java.setCourseName("Java Course");

        CourseDetail courseDetail = new CourseDetail();
        courseDetail.setCourseDetailId(1);
        courseDetail.setCourse(java);
        courseDetail.setSyllabus("Java Syllabus");

        courseRepository.save(courseDetail);

        System.out.println("Course Details has been saved");
    }



}