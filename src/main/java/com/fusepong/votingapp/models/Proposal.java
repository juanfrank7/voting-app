package com.fusepong.votingapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

/*
    @author Juanfg
    30/05/2018
 */
@Entity
@Table(name = "proposal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Proposal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idP;

    @Column(unique = true, nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name = "idCandidate", nullable = false)
    @JsonManagedReference
    private Candidate candidate;

    public Proposal(){}

    public Proposal( String title, String description, Candidate candidate){
        this.title = title;
        this.description = description;
        this.candidate = candidate;
    }

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}
