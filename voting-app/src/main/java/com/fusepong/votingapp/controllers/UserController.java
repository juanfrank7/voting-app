package com.fusepong.votingapp.controllers;

import com.fusepong.votingapp.models.User;
import com.fusepong.votingapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public User findUserByEmail(@RequestBody String email){
        return userService.findUserByEmail(email);
    }

    @RequestMapping(value = "/search/{email}", method = RequestMethod.GET)
    public User findUserByEmailAndPassword(@RequestBody String email, String pass){
        return userService.findUserByEmailAndPassword(email, pass);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public User deleteUser(Integer id){
        return userService.deleteUser(id);
    }

}
