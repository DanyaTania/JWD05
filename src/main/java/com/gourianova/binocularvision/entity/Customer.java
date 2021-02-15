package com.gourianova.binocularvision.entity;

import java.math.BigInteger;

public class Customer {
//    private BigInteger id;
    private String name;
    private String surname;
    private String login;
    private String phone;




    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
       this.surname = surname;
    }

}
