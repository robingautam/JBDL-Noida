package com.gfg.jpa.JBDL.L14.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDetail {
    @Id
    public int courseDetailId;
    public String syllabus;
    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(referencedColumnName = "courseId")
    public Course course;
}
