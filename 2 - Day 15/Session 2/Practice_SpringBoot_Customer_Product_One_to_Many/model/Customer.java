package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int customerId;
    private String customerName;
    private String address;

    @OneToMany(mappedBy = "customer")
    @JsonManagedReference
    private List<Product> products;

    public Customer(){}

    public Customer(String customerName, String address, List<Product> products) {
        this.customerName = customerName;
        this.address = address;
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products.add(products);
    }

    
    
}
