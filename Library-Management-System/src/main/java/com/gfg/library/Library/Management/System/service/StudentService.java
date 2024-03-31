package com.gfg.library.Library.Management.System.service;

import com.gfg.library.Library.Management.System.BookDAO.StudentDAO;
import com.gfg.library.Library.Management.System.model.Student;
import com.gfg.library.Library.Management.System.model.StudentType;
import com.gfg.library.Library.Management.System.request.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public Student createStudentForLibrary(CreateStudentRequest request){
        String id = request.getStudentId();
        String type = request.getStudentType().toString();
        String name = request.getName();
        String email = request.getEmail();
        String phone = request.getPhoneNo();

        Student student = Student.builder().studentId(Integer.parseInt(id)).type(StudentType.valueOf(type))
                .email(email).name(name).phoneNo(phone).build();

       int result =  studentDAO.createStudentInDatabase(student);
       if (result>0){
           System.out.println("Data has been inserted successfully");
           return student;
       }
       return null;
    }
}
