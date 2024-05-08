package com.examly.springapp.model;
 
import org.springframework.stereotype.Component;
 

public class Laptop {
 
    private int laptopId;
    private String laptopBrand;
    private int laptopPrice;
 
    public Laptop(int laptopId, String laptopBrand, int laptopPrice) {
        this.laptopId = laptopId;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }
    public int getLaptopid() {
        return laptopId;
    }
    public void setLaptopid(int laptopid) {
        this.laptopId = laptopid;
    }
    public String getLaptopBrand() {
        return laptopBrand;
    }
    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }
    public int getLaptopPrice() {
        return laptopPrice;
    }
    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }  
   
}
