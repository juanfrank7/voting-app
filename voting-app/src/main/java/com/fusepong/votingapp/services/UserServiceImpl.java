package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.User;
import com.fusepong.votingapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String pass) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(Integer id) {
        return null;
    }
}
