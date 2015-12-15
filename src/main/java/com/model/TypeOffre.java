package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Kouinou on 09/12/2015.
 */
@Entity
@Table(name="type_offre")
public class TypeOffre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_type;
    private String libelle_type;

    @OneToMany(mappedBy="type_offre", cascade=CascadeType.ALL)
    @JsonIgnore
    private Set<Offre> offres;

    public Set<Commerce> getCommerces() {
        return commerces;
    }

    public void setCommerces(Set<Commerce> commerces) {
        this.commerces = commerces;
    }

    @OneToMany(mappedBy="type_offre", cascade=CascadeType.ALL)
    @JsonIgnore
    private Set<Commerce> commerces;

    public Long getId_type() {
        return id_type;
    }

    public void setId_type(Long id_type) {
        this.id_type = id_type;
    }

    public String getLibelle_type() {
        return libelle_type;
    }

    public void setLibelle_type(String libelle_type) {
        this.libelle_type = libelle_type;
    }

    public Set<Offre> getOffres() {
        return offres;
    }

    public void setOffres(Set<Offre> offres) {
        this.offres = offres;
    }
}
