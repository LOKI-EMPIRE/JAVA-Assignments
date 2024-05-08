package com.example.springapp.model;

public class User {
    private long id;
    private String name;
    private String email;
    private int age;
    private String address;

    public User(long id, String name, String email, int age, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
}
