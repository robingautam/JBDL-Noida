package com.gfg.library.Library.Management.System.mockito;

import com.gfg.library.Library.Management.System.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MockitoTestTest {

    @InjectMocks
    MockitoTest mockitoTest;

    @Mock
    DependentClass dependentClass;

    @Test
    void getStudentData() {
        when(dependentClass.getStudent()).thenReturn(fakeStudent());
        Student expected = mockitoTest.getStudentData();
        Assertions.assertEquals("Aakash",expected.getName());
    }

    public Student fakeStudent(){
        Student st = Student.builder().studentId(1).name("Aakash").email("aakash@gmail.com").build();
        return st;
    }
}