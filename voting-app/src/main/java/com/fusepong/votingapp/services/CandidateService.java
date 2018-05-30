package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.Candidate;
import com.fusepong.votingapp.models.Proposal;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
public interface CandidateService {

    List<Candidate> getCandidates();

    Candidate getCandidate(Integer idC);

    Candidate createCandidate(Candidate candidate);

    Candidate updateCandidate(Candidate candidate);

    Candidate findCandidateByEmail(String email);

    Candidate deleteCandidate(Integer idC);

}
