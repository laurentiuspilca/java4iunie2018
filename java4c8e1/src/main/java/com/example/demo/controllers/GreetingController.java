package com.example.demo.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name, Model model, HttpServletResponse response) {
		model.addAttribute("name", name);
		if (true) {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		}
		return "greetings";
	}
}
