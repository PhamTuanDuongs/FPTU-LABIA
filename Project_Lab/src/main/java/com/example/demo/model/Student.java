/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.example.demo.AuthorizationModel.Account;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "Student")
public class Student implements Serializable {

    @Id
    @Column(name = "studentId")
    private String studentId;
    @Column()
    private String studentName;

    @OneToOne
    @JoinColumn(name = "username")
    private Account account;

    @OneToMany(mappedBy = "student")
    List<Participate> participate;

    @ManyToOne
    @MapsId("curriculumId")
    @JoinColumn(name = "curriculumId")
    Curriculum curriculum;

    @OneToMany(mappedBy = "student")
    List<Grade> grades;

    

}
