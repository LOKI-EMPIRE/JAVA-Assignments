package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private int carId;
    private String brand;
    private String color;
    private int price;

    public Car(){}

    public Car(int carId, String brand, String color, int price) {
        this.carId = carId;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    
}
