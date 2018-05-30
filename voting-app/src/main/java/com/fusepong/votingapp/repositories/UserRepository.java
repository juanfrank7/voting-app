package com.fusepong.votingapp.repositories;

import com.fusepong.votingapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    @author Juanfg
    30/05/2018
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
