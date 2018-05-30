package com.fusepong.votingapp.models;

/*
    @author Juanfg
    30/05/2018
 */
public class Proposal {
    private Integer idP;
    private String title;
    private String descrip;

    public Proposal(){}

    public Proposal(Integer idP, String title, String descrip){
        this.idP = idP;
        this.title = title;
        this.descrip = descrip;
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
