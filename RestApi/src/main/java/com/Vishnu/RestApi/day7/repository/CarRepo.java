package com.Vishnu.RestApi.day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vishnu.RestApi.day7.model.Car;


public interface CarRepo extends JpaRepository<Car, Integer>{


}

