package com.example.springapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Door;
import com.example.springapp.service.DoorService;

@RestController
public class DoorController {

    @Autowired
    private DoorService service;

    @PostMapping("/api/door")
    public ResponseEntity<Door> addC(@RequestBody Door d){
        Door d1 = service.addS(d);
        if(d1 != null){
            return new ResponseEntity<>(d1 , HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/door/bycolor/{color}")
    public ResponseEntity<List<Door>> getByColorC(@PathVariable String color){
        List<Door> d = service.getByColorS(color);
        if(d.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(d,HttpStatus.OK);
        }
    }

    @PutMapping("/api/door/{doorId}")
    public ResponseEntity<Door> updateByDoorIdC(@PathVariable int doorId,@RequestParam("color") String color){
        Door d1 = service.updateByDoorIdS(doorId,color);
        if(d1 != null){
            return new ResponseEntity<>(d1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/door/{doorId}")
    public ResponseEntity<String> deleteByIdC(@PathVariable int doorId){
        boolean  b = service.deleteByIdS(doorId);
        if(b){
            return new ResponseEntity<>("Door deleted successfully.",HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door/bydoortype")
    public ResponseEntity<List<Door>> getByDoorTypeC(@RequestParam String doorType){
        List<Door> list = service.getByDoorTypeS(doorType);
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getListC(){
        List<Door> list = service.getListS();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Door> getByIdC(@PathVariable int doorId){
        Door d = service.getByIdS(doorId);
        if(d != null){
            return new ResponseEntity<>(d,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
