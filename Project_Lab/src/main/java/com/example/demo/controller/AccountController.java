/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.AuthorizationModel.Account;
import com.example.demo.AuthorizationModel.Account_Role;
import com.example.demo.AuthorizationModel.Role_Feature;
import com.example.demo.model.Curriculum_Course;
import com.example.demo.model.Grade;
import com.example.demo.model.Group;
import com.example.demo.model.Instructor;
import com.example.demo.model.Participate;
import com.example.demo.model.Student;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.AccountRoleRepository;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.IntstructorRepository;
import com.example.demo.repository.ParticipateRepository;
import com.example.demo.repository.RoleFeatureRepository;
import com.example.demo.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.repository.Curriculum_CourseRepository;
import com.example.demo.repository.GradeRepository;

/**
 *
 * @author admin1
 */
@Controller
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String showLoginForm(ModelMap modelMap) {
        return "authorization/login";
    }

    @RequestMapping(path = "/logins", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
//        List<Account> account = student.findAll();
        List<Account> account = accountRepository.findAll();
        modelMap.addAttribute("list", account);
        return ("jsp/home");
    }
}
