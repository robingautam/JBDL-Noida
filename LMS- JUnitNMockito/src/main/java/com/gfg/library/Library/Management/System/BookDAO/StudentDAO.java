package com.gfg.library.Library.Management.System.BookDAO;

import com.gfg.library.Library.Management.System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public int createStudentInDatabase(Student student){
        String query = "INSERT INTO student (STUDENT_ID, NAME, EMAIL, PHONE_NO, STUDENT_TYPE) VALUES (?,?,?,?,?)";
        int row = jdbcTemplate.update(query, student.getStudentId(), student.getName(), student.getEmail(), student.getPhoneNo(), student.getType().toString());
        return row;
    }
}
