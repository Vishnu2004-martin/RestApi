package com.Vishnu.RestApi.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishnu.RestApi.day6.Repository.ChildRepo;
import com.Vishnu.RestApi.day6.model.Child;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ApiService {
     @Autowired
     ChildRepo re;
     
     public Child save(Child s) {
    	 return re.save(s);
    	 
     }
     public List<Child>show(){
    	 return re.findAll();
     }
     public Child changeinfo(Child ch) {
    	 return re.saveAndFlush(ch);
     }
     public void deleteById(int id) {
    	 re.deleteById(id);
     }
	
	
	
	
}
