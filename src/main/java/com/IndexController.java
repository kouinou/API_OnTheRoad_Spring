package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kouinou on 01/12/2015.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String get() {
        return("OK pour le GET");
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String post() {
        return("OK pour le POST");
    }
}
