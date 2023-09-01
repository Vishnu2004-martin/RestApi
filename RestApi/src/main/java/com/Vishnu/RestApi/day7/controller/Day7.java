package com.Vishnu.RestApi.day7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vishnu.RestApi.day7.model.Car;
import com.Vishnu.RestApi.day7.service.ApiServiceDay7;



@RestController
public class Day7 {
	@Autowired
	ApiServiceDay7 sser;
	@PostMapping("/")
	public Car add(@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/owners/{owners}")
	public Car add(@PathVariable int owners,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/address/{address}")
	public Car add(@PathVariable String address,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/carName/{carName}")
	public Car save(@PathVariable String carName,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/owners/{owners}/carType/{carType}")
	public Car showinfo(@PathVariable int owners,@PathVariable String carType,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
}
