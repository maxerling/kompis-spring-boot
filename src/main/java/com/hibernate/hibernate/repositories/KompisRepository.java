package com.hibernate.hibernate.repositories;

import com.hibernate.hibernate.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-13
 * Copyright: MIT
 * Class: Java20B
 */
public interface KompisRepository extends CrudRepository<Kompis,Long> {
    Iterable<Kompis> findAllByName(String name);
    Iterable<Kompis> findAllByNumber(String number);


}
