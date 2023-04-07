/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin1
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @Column
    private String courseId;

    @Column
    private String courseName;

    @OneToMany(mappedBy = "course")
    List<Group> group;

    @OneToMany(mappedBy = "course")
    List<Curriculum_Course> curriculum_Courses;

    @OneToMany(mappedBy = "course")
    List<GradeCategory> gradeCategorys;
}
