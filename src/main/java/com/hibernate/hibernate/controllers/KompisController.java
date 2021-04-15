package com.hibernate.hibernate.controllers;

import com.hibernate.hibernate.models.Kompis;
import com.hibernate.hibernate.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Max Erling
 * Date: 2021-04-13
 * Copyright: MIT
 * Class: Java20B
 */

@RestController
@RequestMapping(path = "/kompisar")
public class KompisController {

    @Autowired
    private KompisRepository kompisRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewKompis(@RequestParam String name, @RequestParam String email, @RequestParam String number) {
        Kompis temp = new Kompis();

        temp.setName(name);
        temp.setEmail(email);
        temp.setNumber(number);
        kompisRepository.save(temp);
        return "saved";
    }

    @GetMapping(path="/all")
    public Iterable<Kompis> getAllKompisar() {
        return kompisRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<Kompis> findById(@PathVariable String id) {
        return kompisRepository.findById(Long.parseLong(id));
    }

    @GetMapping("/name")
    public Iterable<Kompis> getKompisarByName(@RequestParam String name) {
        return kompisRepository.findAllByName(name);
    }

    @GetMapping("/number")
    public Iterable<Kompis> getKompisarByNumber(@RequestParam String number) {
        return kompisRepository.findAllByNumber(number);
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable String id) {
        kompisRepository.deleteById(Long.parseLong(id));
        return "User with id: " + id + " got deleted";
    }

    @GetMapping()
    public Kompis changeNumberById(@RequestParam String id, @RequestParam String number) {
        Kompis temp = kompisRepository.findById(Long.parseLong(id)).get();
        temp.setNumber(number);
        return kompisRepository.save(temp);
    }







}
