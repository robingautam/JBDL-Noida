package com.gfg.library.Library.Management.System.mockito;

import com.gfg.library.Library.Management.System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class MockitoTest {

    @Autowired
    DependentClass dependentClass;

    public Student getStudentData(){
        return dependentClass.getStudent();

    }
}
