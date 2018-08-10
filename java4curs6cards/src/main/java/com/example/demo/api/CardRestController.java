package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Card;
import com.example.demo.service.CardService;

@RestController
public class CardRestController {

	@Autowired
	private CardService cardService;
	
	@RequestMapping(path ="/add/card", method=RequestMethod.POST)
	public void addCard(@RequestBody Card c) {
		cardService.addCard(c);
	}
	
	@RequestMapping(path ="/cards/{userId}")
	public List<Card> getCardsForUser(@PathVariable("userId") int userId){
		return cardService.findCardsForUser(userId);
	}
	
}
