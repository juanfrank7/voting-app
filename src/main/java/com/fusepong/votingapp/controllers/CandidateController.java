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
    private CandidateRepository candidateRepository;

    @Autowired
    private ProposalRepository proposalRepository;

    @GetMapping
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }

    @GetMapping("/{idCandidate}")
    public Candidate findCandidate(@PathVariable Integer idCandidate) {
        return candidateRepository.getOne(idCandidate);
    }

    @PostMapping("/new")
    public Candidate createCandidate(@RequestBody Candidate cand) {
        if (getCandidateByEmail(cand.getEmail()) == null) {
            cand.setVotes(0);
            candidateRepository.saveAndFlush(cand);
        }
        return cand;
    }

    @GetMapping("/byEmail")
    public Candidate getCandidateByEmail(@RequestParam("email") String email) {
        return candidateRepository.getCandidateByEmail(email);
    }

    @PostMapping("/{idCandidate}/prop")
    public Proposal addProposal(@PathVariable Integer idCandidate, @RequestBody Proposal prop) throws ServletException{
        Candidate newC = candidateRepository.getOne(idCandidate);
        if (newC.getProposal()!=null){
            throw new ServletException("Este candidato ya tiene una propuesta agregada");
        }
        prop.setCandidate(newC);
        newC.setProposal(prop);
        return proposalRepository.saveAndFlush(prop);
    }

    @PutMapping("/{idCandidate}/prop")
    public Proposal modifyProposal(@PathVariable Integer idCandidate, @RequestBody Proposal prop){
        Candidate candidate = candidateRepository.getOne(idCandidate);
        prop.setCandidate(candidate);
        candidate.setProposal(prop);
        return proposalRepository.save(prop);
    }

    @DeleteMapping("/{idCandidate}/prop/{idProposal}")
    public boolean deleteProposal(@PathVariable Integer idCandidate, @PathVariable Integer idProposal) throws ServletException {
        boolean deleted = proposalRepository.existsById(idProposal);
        if (deleted) {
            Candidate candidate = candidateRepository.getOne(idCandidate);
            candidate.setProposal(null);
            proposalRepository.deleteById(idProposal);
        } else {
            throw new ServletException("No se puede borrar esta propuesta");
        }
        return deleted;
    }

    @GetMapping("{idCandidate}/prop")
    public Proposal getProposalByCandidate(@PathVariable Integer idCandidate){
        return candidateRepository.getOne(idCandidate).getProposal();
    }

    @GetMapping("/{idCandidate}/prop/{idProposal}")
    public Proposal getProposalById(@PathVariable Integer idCandidate, @PathVariable Integer idProposal){
        return proposalRepository.getOne(idProposal);
    }

}
