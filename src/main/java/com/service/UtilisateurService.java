package com.service;

import com.model.Commerce;
import com.model.Offre;
import com.model.Utilisateur;
import com.persistence.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Kouinou on 06/12/2015.
 */
@Transactional
@Service
public class UtilisateurService {

    @Autowired
    UtilisateurDao utilisateurDao;

    public Map<String, Object> findByMailAndPassword(String mail, String password){
        return offreAndCommerceByUtilisateur(utilisateurDao.findByMailAndPassword(mail, password));
    }

    public Map<String, Object> offreAndCommerceByUtilisateur(Utilisateur utilisateur){

        Map<String, Object> offreAndCommerce = new HashMap<String, Object>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        //Iterator commerce_iterator;
        //Iterator offre_iterator;

        Set<Object> commerces = new HashSet<Object>();
        Set<Commerce> commerces_recup;
        Set<Offre> offres = new HashSet<Offre>();
        //Set<Offre> offres_temp;



        commerces_recup = utilisateur.getCommerces();



        offreAndCommerce.put("POI", commerces);

        //commerce_iterator = commerces.iterator();

        for (Commerce commerce_iterator : commerces_recup){
            Map<String, Object> map_commerces = new HashMap<String, Object>();
            map_commerces.put("nom", commerce_iterator.getNom());
            map_commerces.put("description", commerce_iterator.getDescription());
            map_commerces.put("type_offre", commerce_iterator.getType_offre());
            map_commerces.put("num_rue", commerce_iterator.getNum_rue());
            map_commerces.put("libelle_rue", commerce_iterator.getLibelle_rue());
            map_commerces.put("code_postal", commerce_iterator.getCode_postal());
            map_commerces.put("libelle_ville", commerce_iterator.getLibelle_ville());
            map_commerces.put("latitude", commerce_iterator.getLatitude());
            map_commerces.put("longitude", commerce_iterator.getLongitude());
            map_commerces.put("libelle_rep_photos", commerce_iterator.getLibelle_rep_photos());
            map_commerces.put("libelle_url_logo", commerce_iterator.getLibelle_url_logo());

            Set<Long> id_offres = new HashSet<Long>();
            for (Offre offre_iterator : commerce_iterator.getOffres()){

                id_offres.add(offre_iterator.getId_offre());

            }

            map_commerces.put("offres", id_offres);
            offres.addAll(commerce_iterator.getOffres());

            commerces.add(map_commerces);
        }

        offreAndCommerce.put("offres", offres);
        offreAndCommerce.put("POI", commerces);
        offreAndCommerce.put("id_utilisateur", utilisateur.getId_utilisateur());



        return offreAndCommerce;
    }

}
