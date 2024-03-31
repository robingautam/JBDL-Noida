package com.gfg.library.Library.Management.System.request;

import com.gfg.library.Library.Management.System.model.Student;
import com.gfg.library.Library.Management.System.model.StudentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentRequest {
    String studentId;
    String name;
    String email;
    String phoneNo;
    StudentType studentType;



}
