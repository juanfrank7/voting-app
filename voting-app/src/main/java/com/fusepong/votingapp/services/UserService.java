package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.User;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
public interface UserService {

    List<User> getUsers();

    User getUser(Integer id);

    User createUser(User user);

    User findUserByEmail(String email);

    User findUserByEmailAndPassword(String email, String pass);

    User updateUser(User user);

    User deleteUser(Integer id);
}
