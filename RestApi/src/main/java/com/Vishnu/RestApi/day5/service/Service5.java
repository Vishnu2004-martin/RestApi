package com.Vishnu.RestApi.day5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishnu.RestApi.day5.model.Model5;
import com.Vishnu.RestApi.day5.repository.Repository5;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Service5 {
        @Autowired
         Repository5 tr;
        public Model5 save(Model5 f) {
        	return tr.save(f);
        }
        public List<Model5> show(Model5 f){
        	return tr.findAll();
        }
        public Model5 changeinfo(Model5 f) {
        	return tr.saveAndFlush(f);
        }
        public void deleteById(int id) {
        	tr.deleteById(id);
        }
        
}
