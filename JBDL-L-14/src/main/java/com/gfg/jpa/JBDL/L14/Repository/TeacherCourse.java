package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherCourse extends JpaRepository<Course, Integer> {
}
