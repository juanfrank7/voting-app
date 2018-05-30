package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.Proposal;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
public interface ProposalService {

    List<Proposal> getProposals();

    Proposal getProposal(Integer idP);

    Proposal createProposal(Proposal proposal);

    Proposal findProposalById(Integer id);

    Proposal updateProposal(Proposal proposal);

    Proposal deleteProposal(Integer idP);
}
