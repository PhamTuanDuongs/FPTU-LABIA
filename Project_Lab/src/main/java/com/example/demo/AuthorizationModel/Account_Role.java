/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.AuthorizationModel;

import com.example.demo.modelKey.AccountRoleKey;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author admin1
 */
@Entity
@Table(name = "Account_Role")
public class Account_Role {
     @EmbeddedId
     AccountRoleKey id;
     
     @ManyToOne
     @MapsId("username")
     @JoinColumn(name = "username")
     Account account;
     
     
     @ManyToOne
     @MapsId("roleId")
     @JoinColumn(name = "roleId")
     Role role;

    public Account_Role() {
    }

     
    public AccountRoleKey getId() {
        return id;
    }

    public void setId(AccountRoleKey id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
     
     
}
