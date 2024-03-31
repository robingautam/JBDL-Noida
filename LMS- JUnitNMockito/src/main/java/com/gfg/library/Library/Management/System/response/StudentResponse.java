package com.gfg.library.Library.Management.System.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse extends Response{
    String studentId;
    String name;
}
