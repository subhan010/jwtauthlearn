package com.jwttest.jwttest.controllers;

import com.jwttest.jwttest.models.Users;
import com.jwttest.jwttest.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/user")
    public List<Users> getUser()
    {
        return userServices.getUsers();

    }
    @GetMapping("/add")
    public void addUser()
    {
         userServices.addUser();
    }
}
