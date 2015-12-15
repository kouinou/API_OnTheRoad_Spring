package com.service;

import com.model.Commerce;
import com.persistence.CommerceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by Kouinou on 11/12/2015.
 */
@Transactional
@Service
public class AndroidService {

    @Autowired
    CommerceDao commerceDao;

    public Set<Commerce> findAll(){

        return commerceDao.findAll();
    }


}
