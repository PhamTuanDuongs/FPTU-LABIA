/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "`Group`")
public class Group {

    @Id
    @Column(name = "groupId")
    private int groupId;
    @Column
    private String groupName;

    @OneToMany(mappedBy = "group")
    List<Participate> participate;
    
    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;
    
    
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

}
