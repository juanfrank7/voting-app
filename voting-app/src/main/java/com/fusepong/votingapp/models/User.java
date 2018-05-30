package com.fusepong.votingapp.models;


/*
    @author Juanfg
    30/05/2018
 */
public class User {

    private Integer idUser;
    private String name;
    private String user;
    private String pass;

    public User(){ }

    public User(Integer id){
        this.idUser = id;
    }
    public User(String name, String user, String pass){
        this.name = name;
        this.user = user;
        this.pass = pass;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
