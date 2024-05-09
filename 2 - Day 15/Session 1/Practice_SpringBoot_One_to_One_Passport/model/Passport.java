package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passport {
    
    @Id
    @GeneratedValue
    private long id;
    private String serialNumber;
    private int issueYear;
    private String country;

    public Passport(){}

    public Passport(String serialNumber, int issueYear, String country) {
        this.serialNumber = serialNumber;
        this.issueYear = issueYear;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
