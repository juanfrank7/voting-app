package com.fusepong.votingapp.repositories;

import com.fusepong.votingapp.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    @author Juanfg
    30/05/2018
 */
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
