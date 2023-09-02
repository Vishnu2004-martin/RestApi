package com.Vishnu.RestApi.day8.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vishnu.RestApi.day8.model.Bike;
import com.Vishnu.RestApi.day8.service.Service;


@RestController
public class Day8Controller {
	@Autowired
	Service bser;
	@PostMapping("/bike")
	public Bike save(@RequestBody Bike s) {
		return bser.add(s);
	}
	@GetMapping("/year/{year}")
	public List<Bike> showByYear(@PathVariable int year) {
		return bser.getByYear(year);
	}
	@GetMapping("/year/name/{year}/{name}")
	public List<Bike> getYearandName(@PathVariable int year,@PathVariable String name){
		return bser.getByYearAndName(year, name);
	}
	@GetMapping("/name/{name}")
	public List<Bike> getbyname(@PathVariable String name){
		return bser.getByName(name);
	}
}
