package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.model.UserDto;
import com.example.demo.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/user/{username}")
	public UserDto findUser(@PathVariable("username") String username) {
		return userService.findUser(username);
	}
}
