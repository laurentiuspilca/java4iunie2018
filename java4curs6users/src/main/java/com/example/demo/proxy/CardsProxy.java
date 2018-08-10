package com.example.demo.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.proxy.model.Card;

@Component
public class CardsProxy {

	@Autowired
	private RestTemplate rest;
	
	public List<Card> getCardsForUser(int userId) {
		String url = "http://localhost:8080/cards/" + userId;
		return rest.getForObject(url, List.class);
	}
}
