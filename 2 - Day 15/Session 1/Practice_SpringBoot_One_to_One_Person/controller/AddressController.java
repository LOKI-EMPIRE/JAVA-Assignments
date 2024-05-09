package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Address;
import com.examly.springapp.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    private AddressService aservice;

    @PostMapping("/address/person/{personId}")
    public ResponseEntity<Address> addAddressC(@PathVariable long personId,@RequestBody Address a){
        Address a1 = aservice.addAddressS(personId, a);
        if(a1 != null){
            return new ResponseEntity<>(a1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
