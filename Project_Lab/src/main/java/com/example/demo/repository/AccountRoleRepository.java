/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.AuthorizationModel.Account_Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author admin1
 */
public interface AccountRoleRepository extends JpaRepository<Account_Role, String>{
    
}
