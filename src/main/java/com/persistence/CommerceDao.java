package com.persistence;

import com.model.Commerce;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by Kouinou on 11/12/2015.
 */
public interface CommerceDao extends CrudRepository<Commerce, Long> {

    public Set<Commerce> findAll();
}
