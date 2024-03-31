package com.gfg.library.Library.Management.System.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    int id;
    int studentId;
    String name;
    String email;
    String phoneNo;
    List<Book> books;
    Address address;
    StudentType type;
    Date createdOn;
    Date updatedOn;

}
