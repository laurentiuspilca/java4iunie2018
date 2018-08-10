package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Card;
import com.example.demo.repo.CardRepository;

@Service
@Transactional
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	public void addCard(Card c) {
		cardRepository.save(c);
	}
	
	public List<Card> findCardsForUser (int user){
		return cardRepository.getCards(user);
	}

}
