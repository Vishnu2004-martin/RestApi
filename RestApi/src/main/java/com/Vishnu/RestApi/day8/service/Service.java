package com.Vishnu.RestApi.day8.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.Vishnu.RestApi.day8.model.Bike;
import com.Vishnu.RestApi.day8.repository.BikeRepo;



@org.springframework.stereotype.Service
public class Service {
	@Autowired
	BikeRepo br;
	public Bike add(Bike s) {
		return br.save(s);
	}
	public List<Bike> getByYear(int year){
		return br.getByYear(year);
	}
	public List<Bike> getByYearAndName(int year,String name){
		return br.getByYearAndName(year, name);
	}
	public List<Bike> getByName(String name){
		return br.getByName(name);
	}
}