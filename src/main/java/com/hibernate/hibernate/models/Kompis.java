package com.hibernate.hibernate.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Max Erling
 * Date: 2021-04-13
 * Copyright: MIT
 * Class: Java20B
 */

@Entity
public class Kompis {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String number;

    public Kompis() {}

    public Kompis(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Kompis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
