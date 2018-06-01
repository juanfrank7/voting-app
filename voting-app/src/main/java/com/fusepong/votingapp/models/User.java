package com.fusepong.votingapp.models;


import javax.persistence.*;
import java.util.Date;

/*
    @author Juanfg
    30/05/2018
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String firstname;
    private String lastname;
    private Date birth;
    private String cedula;
    private String email;
    private String password;

    public User() {
    }

    public User(Integer id) {
        this.idUser = id;
    }

    public User(String firstname, String lastname, Date birth, String cedula, String email, String pass) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.cedula = cedula;
        this.email = email;
        this.password = pass;
    }

    @Column(name = "idUser", unique = true, nullable = false)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Column(name = "firstname", nullable = false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "lastname", nullable = false)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "birth", nullable = false)
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Column(name = "cedula", nullable = false)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{" + "id=" + getIdUser() + ", email='" + getEmail() + '\'' + ", password='" + getPassword() + '\'' + ", firstname='"
                + getFirstname() + '\'' + '}';
    }
}
