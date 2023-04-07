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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.*;

/**
 *
 * @author admin1
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Curriculum")
public class Curriculum implements Serializable {

    @Id
    @Column
    private String curriculumId;
    @Column
    private String curriculumName;

    @OneToMany(mappedBy = "curriculum")
    List<Student> student;

    @OneToMany(mappedBy = "curriculum")
    List<Curriculum_Course> curriculum_Courses;

}
