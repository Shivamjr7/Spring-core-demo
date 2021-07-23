package com.shivam.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.springdemo.service.GameService;

@RestController()
public class GameController {

	@Autowired
	GameService service;
	
	@GetMapping("/game")
	public String playGame(){
		
		return service.playGame();
	}
	
}
