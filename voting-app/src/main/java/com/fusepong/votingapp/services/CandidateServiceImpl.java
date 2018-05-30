package com.fusepong.votingapp.services;

import com.fusepong.votingapp.models.Candidate;
import com.fusepong.votingapp.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@Service
public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<Candidate> getCandidates() {
        return null;
    }

    @Override
    public Candidate getCandidate(Integer idC) {
        return null;
    }

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return null;
    }

    @Override
    public Candidate updateCandidate(Candidate candidate) {
        return null;
    }

    @Override
    public Candidate findCandidateByEmail(String email) {
        return null;
    }

    @Override
    public Candidate deleteCandidate(Integer idC) {
        return null;
    }
}
