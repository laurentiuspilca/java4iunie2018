package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {
   
	@Query("SELECT c FROM Card c WHERE c.user = :user")
	public List<Card> getCards(@Param("user") int user);
}
