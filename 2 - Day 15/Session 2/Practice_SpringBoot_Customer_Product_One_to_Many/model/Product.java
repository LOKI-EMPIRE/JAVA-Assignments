package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private double price;

    @ManyToOne
    @JsonBackReference
    private Customer customer;

    public Product(){}

    public Product(String productName, double price, Customer customer) {
        this.productName = productName;
        this.price = price;
        this.customer = customer;
    }

    public int getProductId() {
        return productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
}
