package com.shivam.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shivam.springdemo.model.Game;

@Service
public class GameService {

	@Autowired
	@Qualifier("ninja")
	Game game ;
	
	
	
	public String playGame()
	{
		game.play();
		
		return "Stage 1 TMNT : Ralph and Don against the Shredder";
	}
	
}
