package com.fusepong.votingapp.models;

/*
    @author Juanfg
    30/05/2018
 */
public class Candidate {
    private Integer idC;
    private String firstName;
    private String lastName;
    private String polParty;
    private String cv;

    public Candidate(){}

    public Candidate(Integer idC, String firstName, String lastName, String polParty, String cv){
        this.idC = idC;
        this.firstName = firstName;
        this.lastName = lastName;
        this.polParty = polParty;
        this.cv = cv;
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
}


