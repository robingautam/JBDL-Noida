package com.gfg.jpa.JBDL.L14.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    public int id;
    public int courseId;
    public String courseName;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            referencedColumnName = "teacherId"
    )
    public Teacher teacher;
}
