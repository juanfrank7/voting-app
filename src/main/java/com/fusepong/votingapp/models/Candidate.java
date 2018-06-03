package com.fusepong.votingapp.models;

import javax.persistence.*;
import javax.validation.constraints.Email;

/*
    @author Juanfg
    30/05/2018
 */
@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idC;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String polParty;

    @Column(name = "curriculum", nullable = false)
    private String cv;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "votes")
    private Integer votes;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "candidate")
    private Proposal proposal;

    public Candidate(){}

    public Candidate( String firstName, String lastName, String polParty, String cv, String email, String password){

        this.firstName = firstName;
        this.lastName = lastName;
        this.polParty = polParty;
        this.cv = cv;
        this.email = email;
        this.password = password;
        this.votes = 0;
    }

    public Integer getIdC() {
        return idC;
    }

    public void setIdC(Integer idC) {
        this.idC = idC;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPolParty() {
        return polParty;
    }

    public void setPolParty(String polParty) {
        this.polParty = polParty;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }
}


