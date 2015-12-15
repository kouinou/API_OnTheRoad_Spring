package com.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Kouinou on 06/12/2015.
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_utilisateur;
    private Character sexe;
    private String prenom;
    private String nom;
    private String mail;
    private String telephone;
    private String user;
    private String password;
    private Integer is_premium;


    @OneToMany(mappedBy="utilisateur", cascade=CascadeType.ALL)
    private Set<Commerce> commerces;

    public Utilisateur(){

    }

    public Long getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Long id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIs_premium() {
        return is_premium;
    }

    public void setIs_premium(Integer is_premium) {
        this.is_premium = is_premium;
    }

    public Set<Commerce> getCommerces() {
        return commerces;
    }

    public void setCommerces(Set<Commerce> commerces) {
        this.commerces = commerces;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", sexe=" + sexe +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", is_premium=" + is_premium +
                ", commerces=" + commerces +
                '}';
    }
}
