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
@Table(name = "Instructor")
public class Instructor implements Serializable {

    @Id
    @Column(name = "instructorId")
    private String instructorId;
    @Column
    private String instructorName;

    @OneToMany(mappedBy = "instructor")
    List<Group> group;

    @OneToOne
    @JoinColumn(name="username")
    private Account account;
}
