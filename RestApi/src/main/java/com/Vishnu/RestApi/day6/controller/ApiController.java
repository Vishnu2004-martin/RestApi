package com.Vishnu.RestApi.day6.controller;

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

import com.Vishnu.RestApi.day6.model.Child;
import com.Vishnu.RestApi.day6.service.ApiService;

@RestController
@RequestMapping("/api/v1/day6")
public class ApiController {
        @Autowired
        ApiService ap;
        @PostMapping("/add")
        public ResponseEntity<Child> add(@RequestBody Child ch){
        	return ResponseEntity.status(200).body(ap.save(ch));
        }
        @GetMapping("/show")
        public ResponseEntity<Child> get(@RequestBody Child ch){
        	return ResponseEntity.status(200).body(ap.save(ch));
        }
        @PutMapping("update/{id}")
        public  Child changeinfo(@RequestBody Child ch){
        	return  ap.changeinfo(ch);
        }
        	
        
        @DeleteMapping("deleted/{id}")
        public void delete(@PathVariable int id) {
        	ap.deleteById(id);
        }
}
