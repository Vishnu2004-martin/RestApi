package com.Vishnu.RestApi.day4.controller;

import org.springframework.beans.factory.annotation.Autowired;



//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Vishnu.RestApi.day4.model.Model4;
import com.Vishnu.RestApi.day4.service.Day4Service;




@RestController
@RequestMapping("/api/v1/user")
public class Day4Controller {
	@Autowired
	Day4Service sser;
	@PostMapping("/addUser")
	public ResponseEntity<Model4> addUser(@RequestBody Model4 user) {
		return ResponseEntity.status(200).body(sser.saveinfo(user));
	}
	@GetMapping("/show")
	public ResponseEntity<Model4> getUser(@RequestBody Model4 user) {
		return ResponseEntity.status(200).body(sser.saveinfo(user));
	}
	@PutMapping("/update")
	public ResponseEntity<Model4> putUser(@RequestBody Model4 user) {
		return ResponseEntity.status(200).body(sser.changeinfo(user));
	}
	@DeleteMapping("/deleteUser/{id}")
	public void delete (@PathVariable int id){
		
			sser.deleteById(id);
		
		
	}
}