package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String eamil;
    private String phoneNumber;
    private String nationality;

    @OneToOne
    private Address address;

    public Person(){}

    public Person(String name, String eamil, String phoneNumber, String nationality, Address address) {
        this.name = name;
        this.eamil = eamil;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
