package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Kouinou on 06/12/2015.
 */
@Entity
@Table(name = "commerce")
public class Commerce {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_commerce;
    private String nom;
    private String description;
    @ManyToOne
    @JoinColumn(name="id_type")
    private TypeOffre type_offre;
    private Integer num_rue;
    private String libelle_rue;
    private Integer code_postal;
    private String libelle_ville;
    private Double latitude;
    private Double longitude;
    private String libelle_rep_photos;
    private String libelle_url_logo;

    @ManyToOne
    @JoinColumn(name="id_utilisateur")
    @JsonIgnore
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinTable(name = "offre_commerce",
        joinColumns = @JoinColumn(name = "id_commerce"),
        inverseJoinColumns = @JoinColumn(name = "id_offre"))
    private Set<Offre> offres;

    public TypeOffre getType_offre() {
        return type_offre;
    }

    public void setType_offre(TypeOffre type_offre) {
        this.type_offre = type_offre;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }




    public Commerce(){

    }

    public Long getId_commerce() {
        return id_commerce;
    }

    public void setId_commerce(Long id_commerce) {
        this.id_commerce = id_commerce;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNum_rue() {
        return num_rue;
    }

    public void setNum_rue(Integer num_rue) {
        this.num_rue = num_rue;
    }

    public String getLibelle_rue() {
        return libelle_rue;
    }

    public void setLibelle_rue(String libelle_rue) {
        this.libelle_rue = libelle_rue;
    }

    public Integer getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(Integer code_postal) {
        this.code_postal = code_postal;
    }

    public String getLibelle_ville() {
        return libelle_ville;
    }

    public void setLibelle_ville(String libelle_ville) {
        this.libelle_ville = libelle_ville;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLibelle_rep_photos() {
        return libelle_rep_photos;
    }

    public void setLibelle_rep_photos(String libelle_rep_photos) {
        this.libelle_rep_photos = libelle_rep_photos;
    }

    public String getLibelle_url_logo() {
        return libelle_url_logo;
    }

    public void setLibelle_url_logo(String libelle_url_logo) {
        this.libelle_url_logo = libelle_url_logo;
    }

    public Set<Offre> getOffres() {
        return offres;
    }

    public void setOffres(Set<Offre> offres) {
        this.offres = offres;
    }

    @Override
    public String toString() {
        return "Commerce{" +
                "id_commerce=" + id_commerce +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", num_rue=" + num_rue +
                ", libelle_rue='" + libelle_rue + '\'' +
                ", code_postal=" + code_postal +
                ", libelle_ville='" + libelle_ville + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", libelle_rep_photos='" + libelle_rep_photos + '\'' +
                ", libelle_url_logo='" + libelle_url_logo + '\'' +
                ", offres=" + offres +
                '}';
    }
}
