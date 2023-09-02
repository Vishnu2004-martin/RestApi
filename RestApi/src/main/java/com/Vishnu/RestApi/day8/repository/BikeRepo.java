package com.Vishnu.RestApi.day8.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.Vishnu.RestApi.day8.model.Bike;


public interface BikeRepo extends JpaRepository<Bike, Integer>{
	@Query(value = "select * from bikedetails where year =:yr",nativeQuery = true)
	public List<Bike> getByYear(@Param("yr") int yr);
	@Query(value = "slect * from bikedetails where year =:yr and bike_name =:bn",nativeQuery = true)
	public List<Bike> getByYearAndName(@Param("yr") int yr,@Param("bn") String bn);
	@Query(value = "select * from bikedetails where bike_name =:bn",nativeQuery = true)
	public List<Bike> getByName(@Param("bn")String bn);
}
