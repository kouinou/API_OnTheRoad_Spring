package com.persistence;

import com.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kouinou on 06/12/2015.
 */
public interface UtilisateurDao extends CrudRepository <Utilisateur, Long> {


    public Utilisateur findByMailAndPassword(String mail, String password);



}
