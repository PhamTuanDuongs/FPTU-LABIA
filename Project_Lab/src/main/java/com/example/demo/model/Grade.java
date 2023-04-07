/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.example.demo.modelKey.GradeKey;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.*;

/**
 *
 * @author admin1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Grade")
public class Grade implements Serializable {

    @EmbeddedId
    GradeKey id;
    
    
    @Column()
    private float gradeValue;

    @ManyToOne
    @MapsId("gradeCategoryId")
    @JoinColumn(name = "gradeCategoryId")
    GradeCategory gradeCategory;
 
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "studentId")
    Student student;


    @ManyToOne
    @MapsId("semesterId")
    @JoinColumn(name = "semesterId")
    Semester semester;

    
    
  


}
