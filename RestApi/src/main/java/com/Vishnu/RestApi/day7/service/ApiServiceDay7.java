package com.Vishnu.RestApi.day7.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishnu.RestApi.day7.model.Car;
import com.Vishnu.RestApi.day7.repository.CarRepo;


@Service
public class ApiServiceDay7{ 
	@Autowired
	CarRepo sr;
	public Car saveinfo(Car s) {
		return sr.save(s);
	}
	public List<Car> showinfo(int owners) {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
}
