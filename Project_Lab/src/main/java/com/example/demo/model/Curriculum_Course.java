/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.example.demo.modelKey.Curriculum_CourseKey;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name = "Curriculum_Course")
public class Curriculum_Course {

    @EmbeddedId
    Curriculum_CourseKey id;
    @ManyToOne
    @MapsId("curriculumId")
    @JoinColumn(name = "curriculumId")
    Curriculum curriculum;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courseId")
    Course course;

    
    
    
}
