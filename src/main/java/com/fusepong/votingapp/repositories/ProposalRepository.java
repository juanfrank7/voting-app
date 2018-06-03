package com.fusepong.votingapp.repositories;

import com.fusepong.votingapp.models.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    @author Juanfg
    30/05/2018
 */
@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
}
