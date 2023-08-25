package com.Vishnu.RestApi.day4.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Vishnu.RestApi.day4.model.Model4;
import com.Vishnu.RestApi.day4.repository.Repository4;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Day4Service {
	@Autowired
	Repository4 sr;
	
	public Model4 saveinfo(Model4 s) {
		return sr.save(s);
	}
	public List<Model4> showinfo(){
		return sr.findAll();
	}
	public Model4 changeinfo(Model4 s) {
		return sr.saveAndFlush(s);
	}
	
//	public Page<Model4> getAllUser(PageRequest pageRequest){
//		return sr.findAll(pageRequest);
//	}
		
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}
}