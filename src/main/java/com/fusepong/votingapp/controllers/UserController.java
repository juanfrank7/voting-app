package com.fusepong.votingapp.controllers;

import com.fusepong.votingapp.models.User;
import com.fusepong.votingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userRepository.getOne(id);
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        if(findUserByEmail(user.getEmail())==null){
            userRepository.saveAndFlush(user);
        }
        return user;
    }

    @PatchMapping("/user/{id}")
    public boolean changeAdmin(@PathVariable Integer id, @RequestParam("admin") boolean admin){
        userRepository.getOne(id).setAdmin(admin);
        return admin;
    }

    @GetMapping("/search")
    public User findUserByEmail(@RequestParam("email") String email){
        return userRepository.findUserByEmail(email);
    }

}
