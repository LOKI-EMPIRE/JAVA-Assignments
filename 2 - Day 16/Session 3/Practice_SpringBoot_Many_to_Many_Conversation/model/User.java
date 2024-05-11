package com.examly.springapp.model;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
 
    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    @ManyToMany
    @JoinTable(
        name = "user_message",
        joinColumns = @JoinColumn(name ="user_id"),
        inverseJoinColumns =@JoinColumn(name ="message_id")
    )
    private Set<Message> messages = new HashSet<>();

    public User(){}

    public User(String name, Set<Message> messages) {
        this.name = name;
        this.messages = messages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message){
        this.messages.add(message);
    }
    
}
