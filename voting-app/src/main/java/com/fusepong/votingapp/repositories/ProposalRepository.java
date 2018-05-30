package com.fusepong.votingapp.repositories;

import com.fusepong.votingapp.models.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    @author Juanfg
    30/05/2018
 */
public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
}
