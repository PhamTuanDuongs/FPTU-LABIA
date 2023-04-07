/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author admin1
 */
public interface IntstructorRepository extends JpaRepository<Instructor, String>{
    
}
