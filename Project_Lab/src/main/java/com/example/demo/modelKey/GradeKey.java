/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelKey;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author admin1
 */
@Embeddable
public class GradeKey implements Serializable {

    @Column(name = "gradeCategoryId")
    int gradeCategoryId;

    @Column(name = "studentId")
    String studentId;

    @Column(name = "semesterId")
    String semesterId;

}
