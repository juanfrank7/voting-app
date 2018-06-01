package com.fusepong.votingapp.models;

import javax.persistence.*;

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
    private String firstName;
    private String lastName;
    private String polParty;
    private String cv;
    private String email;
    private String password;

    @OneToOne(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "idC")
    private Proposal proposal;

    public Candidate(){}

    public Candidate( String firstName, String lastName, String polParty, String cv, String email, String password){

        this.firstName = firstName;
        this.lastName = lastName;
        this.polParty = polParty;
        this.cv = cv;
        this.email = email;
        this.password = password;
    }

    @Column(name = "idC", unique = true, nullable = false)
    public Integer getIdC() {
        return idC;
    }

    public void setIdC(Integer idC) {
        this.idC = idC;
    }

    @Column(name = "firstName", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "polParty", nullable = false)
    public String getPolParty() {
        return polParty;
    }

    public void setPolParty(String polParty) {
        this.polParty = polParty;
    }

    @Column(name = "curriculum", nullable = false)
    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "pass", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


