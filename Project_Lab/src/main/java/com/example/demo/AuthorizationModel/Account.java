/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.AuthorizationModel;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Account")
public class Account implements Serializable {

    @Id
    private String username;
    private String password;

    @OneToOne(mappedBy = "account")
    Student student;

    @OneToOne(mappedBy = "account")
    Instructor instructor;

    @OneToMany(mappedBy = "account")
    List<Account_Role> account_Role;

}
