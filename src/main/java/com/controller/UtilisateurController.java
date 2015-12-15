package com.controller;

import com.google.gson.Gson;
import com.model.Commerce;
import com.model.Utilisateur;
import com.persistence.UtilisateurDao;

import com.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Kouinou on 06/12/2015.
 */
@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;
    private static final Logger log = Logger.getLogger(UtilisateurController.class.getName());

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(String mail, String password) {
        log.log(Level.WARNING, mail);
        Map<String, Object> offreAndCommerce;
        offreAndCommerce = utilisateurService.findByMailAndPassword(mail, password);

        log.log(Level.INFO, offreAndCommerce.toString());





        return offreAndCommerce;
    }



}
