package com.fusepong.votingapp.controllers;

import com.fusepong.votingapp.models.Candidate;
import com.fusepong.votingapp.models.Proposal;
import com.fusepong.votingapp.repositories.CandidateRepository;
import com.fusepong.votingapp.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.List;

/*
    @author Juanfg
    30/05/2018
 */
@RestController
@RequestMapping("candidate")
public class CandidateController {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    ProposalRepository proposalRepository;

    @GetMapping
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }

    @GetMapping("/{candId}")
    public Candidate findCandidateById(@PathVariable Integer id) {
        return candidateRepository.getOne(id);
    }

    @PostMapping("/new")
    public Candidate createCandidate(@RequestBody Candidate cand) {
        if (getCandidateByEmail(cand.getEmail()) == null) {
            candidateRepository.saveAndFlush(cand);
        }
        return cand;
    }

    @GetMapping("/byEmail")
    public Candidate getCandidateByEmail(@RequestBody String email) {
        return candidateRepository.getCandidateByEmail(email);
    }

    @PostMapping("/{idCandidate}/prop")
    public Proposal addProposal(@PathVariable Integer idCandidate, @RequestBody Proposal prop) throws ServletException{
        if (idCandidate == proposalRepository.getOne(prop.getIdP()).getCandidate().getIdC()){
            throw new ServletException("Este candidato ya tiene una propuesta agregada");
        }
        candidateRepository.getOne(idCandidate).setProposal(prop);
        return proposalRepository.saveAndFlush(prop);
    }

    @PutMapping("/{idCandidate}/prop")
    public Proposal modifyProposal(@PathVariable Integer idCandidate, @RequestBody Proposal prop){
        Candidate candidate = candidateRepository.getOne(idCandidate);
        candidate.setProposal(prop);
        return proposalRepository.save(prop);
    }

    @DeleteMapping("/{idCandidate}/prop/{idProposal}")
    public boolean deleteProposal(Integer idCandidate, Integer idProposal) throws ServletException{
        boolean deleted = proposalRepository.existsById(idProposal);
        if (deleted){
            Candidate candidate = candidateRepository.getOne(idCandidate);
            candidate.setProposal(null);
            proposalRepository.deleteById(idProposal);
        }
        return deleted;
    }

    @GetMapping("{idCandidate}/prop")
    public Proposal getProposalByCandidate(@PathVariable Integer idCandidate){
        return candidateRepository.getOne(idCandidate).getProposal();
    }

    @GetMapping("/{idCandidate}/prop/{idProposal}")
    public Proposal getProposalById(Integer idCandidate, Integer idProposal){
        return proposalRepository.getOne(idProposal);
    }

}
