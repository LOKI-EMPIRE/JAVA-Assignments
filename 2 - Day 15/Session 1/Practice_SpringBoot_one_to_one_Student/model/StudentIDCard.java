package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentIDCard {
    
    @Id
    private long id;
    private String cardNumber;

    public StudentIDCard(){}

    public StudentIDCard(long id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
