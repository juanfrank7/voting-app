package com.fusepong.votingapp.repositories;

import com.fusepong.votingapp.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    @author Juanfg
    30/05/2018
 */
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    Candidate getCandidateByEmail(String email);
}
