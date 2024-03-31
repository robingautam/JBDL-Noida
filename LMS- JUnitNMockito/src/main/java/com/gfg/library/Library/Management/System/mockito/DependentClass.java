package com.gfg.library.Library.Management.System.mockito;

import com.gfg.library.Library.Management.System.model.Student;
import org.springframework.stereotype.Component;

@Component
public class DependentClass {

    public Student getStudent(){
        Student st = Student.builder().studentId(1).name("Robin").email("robin@gmail.com").build();
        return st;
    }
}

