package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
