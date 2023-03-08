package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.entity;
import com.example.demo.repository.repositary;


@Service
public class service {

			@Autowired
			repositary Repo;
			
			public entity saveDetails(entity e) {
				return Repo.save(e);
			}
			
			public List<entity> getDetails(){
				return Repo.findAll();
			}
			
			public entity updateDetails(entity e1) {
				return Repo.saveAndFlush(e1);
			}
			
			public void deleteDetails(int id) {
				Repo.deleteById(id);
			}

		}