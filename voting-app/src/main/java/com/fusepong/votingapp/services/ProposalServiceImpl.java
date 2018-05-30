package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.Proposal;
import com.fusepong.votingapp.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@Service
public class ProposalServiceImpl implements ProposalService{

    @Autowired
    private ProposalRepository proposalRepository;

    @Override
    public List<Proposal> getProposals() {
        return null;
    }

    @Override
    public Proposal getProposal(Integer idP) {
        return null;
    }

    @Override
    public Proposal createProposal(Proposal proposal) {
        return null;
    }

    @Override
    public Proposal findProposalById(Integer id) {
        return null;
    }

    @Override
    public Proposal updateProposal(Proposal proposal) {
        return null;
    }

    @Override
    public Proposal deleteProposal(Integer idP) {
        return null;
    }
}
