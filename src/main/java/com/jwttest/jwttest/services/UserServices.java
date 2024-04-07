package com.jwttest.jwttest.services;


import com.jwttest.jwttest.models.Users;
import com.jwttest.jwttest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    @Autowired
    private UserRepo userRepo;


    private List<Users> usr= new ArrayList();

    public  UserServices()
    {
//        usr.add(new Users(UUID.randomUUID().toString(),"Rock","rock@gmail.com"));
//        usr.add(new Users(UUID.randomUUID().toString(),"bottom","bottom@gmail.com"));
//        usr.add(new Users(UUID.randomUUID().toString(),"Top","top@gmail.com"));

    }

    public void addUser()
    {
        userRepo.save(new Users(1,"Test1","Rock","Nurse"));
        userRepo.save(new Users(2,"Test2","Bottom","Recep"));
        userRepo.save(new Users(3,"Test3","Top","Pharma"));
    }

    public List<Users> getUsers()
    {
       return userRepo.findAll();
    }

}
