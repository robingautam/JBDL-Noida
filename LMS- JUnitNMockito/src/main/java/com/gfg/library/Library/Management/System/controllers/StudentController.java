package com.gfg.library.Library.Management.System.controllers;

import com.gfg.library.Library.Management.System.model.Student;
import com.gfg.library.Library.Management.System.request.CreateStudentRequest;
import com.gfg.library.Library.Management.System.response.StudentResponse;
import com.gfg.library.Library.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/create/student")
    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody(required = false) CreateStudentRequest createStudentRequest){
        StudentResponse studentResponse = new StudentResponse();
        Student student = studentService.createStudentForLibrary(createStudentRequest);
        if (student==null){
            studentResponse.setErrCode("001");
            studentResponse.setErrMessage("Data Not Created");
            return new ResponseEntity<>(studentResponse, HttpStatus.BAD_REQUEST);
        }
        studentResponse.setErrCode("00");
        studentResponse.setErrMessage("Student Has been created");
        studentResponse.setStudentId(Integer.toString(student.getStudentId()));
        studentResponse.setName(student.getName());
        return new ResponseEntity<>(studentResponse,HttpStatus.CREATED);
    }
}
