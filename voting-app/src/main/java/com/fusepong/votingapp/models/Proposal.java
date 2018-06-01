package com.fusepong.votingapp.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

/*
    @author Juanfg
    30/05/2018
 */
@Entity
@Table(name = "proposal")
public class Proposal {
    private Integer idP;
    private String title;
    private String descrip;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idC")
    @Fetch(value = FetchMode.JOIN)
    private Candidate idC;

    public Proposal(){}

    public Proposal( String title, String descrip){

        this.title = title;
        this.descrip = descrip;
    }

    @Column(name = "idP", unique = true, nullable = false)
    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", nullable = false)
    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Candidate getIdC() {
        return idC;
    }

    public void setIdC(Candidate idC) {
        this.idC = idC;
    }
}
