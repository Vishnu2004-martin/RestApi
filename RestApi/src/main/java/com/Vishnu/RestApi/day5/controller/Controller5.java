package com.Vishnu.RestApi.day5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vishnu.RestApi.day5.model.Model5;
import com.Vishnu.RestApi.day5.service.Service5;

@RestController
@RequestMapping("/api/v1/books")
public class Controller5 {
   @Autowired
     Service5 s;
     @PostMapping("/addUser")
     public ResponseEntity<Model5> addUser(@RequestBody Model5 m ){
    	 return ResponseEntity.status(200).body(s.save(m));
     }
     @GetMapping("/give")
     public ResponseEntity<List<Model5>> give(@RequestBody Model5 m){
    	 return ResponseEntity.status(200).body(s.show(m));
     }
     @PutMapping("/updatebooks")
     public ResponseEntity<Model5> update(@RequestBody Model5 m){
    	 return ResponseEntity.status(200).body(s.changeinfo(m));
     }
     @DeleteMapping("/deleteUser/{id}")
                public void delete(@PathVariable int id) {
    	 s.deleteById(id);
     }
}
