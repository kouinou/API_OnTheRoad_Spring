package com.controller;

import com.model.Commerce;
import com.service.AndroidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Kouinou on 11/12/2015.
 */
@RestController
public class AndroidController {

    @Autowired
    AndroidService androidService;
    private static final Logger log = Logger.getLogger(AndroidController.class.getName());

    @RequestMapping(value = "/commerces/get", method = RequestMethod.GET)
    @ResponseBody
    public Set<Commerce> getCommerces(){
        Set<Commerce> lstCommerces;

        lstCommerces = androidService.findAll();

        log.log(Level.INFO, lstCommerces.toString());

        return lstCommerces;
    }
}
