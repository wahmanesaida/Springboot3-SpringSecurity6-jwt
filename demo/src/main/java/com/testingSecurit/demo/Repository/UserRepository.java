package com.testingSecurit.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingSecurit.demo.Entity.User;



public interface UserRepository extends JpaRepository<User, Integer>{
    // since email is unique we'll find user by email
    Optional<User> findByEmail(String email);
    
}
