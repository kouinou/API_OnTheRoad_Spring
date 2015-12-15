package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by Kouinou on 06/12/2015.
 */
@Entity
@Table(name = "offre")
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_offre;
    private java.util.Date date_debut;
    @Transient
    private String date_debut_parsed;
    private java.util.Date date_fin;
    @Transient
    private String date_fin_parsed;
    private String promotion;
    private String description;
    private String libelle_rep_photos;

    @ManyToOne
    @JoinColumn(name="id_type")
    private TypeOffre type_offre;

    public Offre() {

    }



    public Long getId_offre() { return id_offre;}
    public java.util.Date getDate_debut() {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date_debut_parsed = sdf.format(this.date_debut);
        return this.date_debut;
    }

    public void setDate_debut(Timestamp date_debut) {

        this.date_debut = date_debut;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date_debut_parsed = sdf.format(date_debut);
    }

    public java.util.Date getDate_fin() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date_fin_parsed = sdf.format(this.date_fin);
        return date_fin;
    }

    public void setDate_fin(Timestamp date_fin) {

        this.date_fin = date_fin;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date_fin_parsed = sdf.format(date_fin);
    }

    public String getDate_debut_parsed() {
        return date_debut_parsed;
    }

    public void setDate_debut_parsed(String date_debut_parsed) {
        this.date_debut_parsed = date_debut_parsed;
    }

    public String getDate_fin_parsed() {
        return date_fin_parsed;
    }

    public void setDate_fin_parsed(String date_fin_parsed) {
        this.date_fin_parsed = date_fin_parsed;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescritpion(String descritpion) {
        this.description = descritpion;
    }

    public String getLibelle_rep_photos() {
        return libelle_rep_photos;
    }

    public void setLibelle_rep_photos(String libelle_rep_photos) {
        this.libelle_rep_photos = libelle_rep_photos;
    }

    public TypeOffre getTypeOffre() {
        return type_offre;
    }

    public void setTypeOffre(TypeOffre typeOffre) {
        this.type_offre = typeOffre;
    }
}
