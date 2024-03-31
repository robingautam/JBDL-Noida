package com.gfg.jpa.JBDL.L14.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    public int id;
    public int teacherId;
    public String name;
  /*  @OneToMany(
            cascade = CascadeType.ALL
    )
            @JoinColumn(
                    referencedColumnName = "teacherId"
            )
    List<Course> courseList;*/
}
