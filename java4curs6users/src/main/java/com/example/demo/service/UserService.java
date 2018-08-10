package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.model.UserDto;
import com.example.demo.entities.User;
import com.example.demo.proxy.CardsProxy;
import com.example.demo.proxy.model.Card;
import com.example.demo.repo.UserRepo;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CardsProxy cardsProxy;
	
	
	public UserDto findUser(String username) {
		UserDto userDto = new UserDto();
		
		User user = userRepo.findUserByUsername(username);
		List<Card> cards = cardsProxy.getCardsForUser(user.getId());
		
		userDto.setId(user.getId());
		userDto.setUsername(username);
		userDto.setName(user.getName());
		userDto.setCards(cards);
		
		return userDto;
	}
}
