package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Person;
import com.example.demo.repo.PersonRepo;

@RestController
public class PersonController {

	@Autowired
	private PersonRepo personRepo;
	
	@RequestMapping("/persons")
	public List<Person> findAllPersons() {
		return personRepo.findAll();
	}
	
}
