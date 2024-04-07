package com.jwttest.jwttest.repo;

import com.jwttest.jwttest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepo extends JpaRepository<Users,Long> {



}
