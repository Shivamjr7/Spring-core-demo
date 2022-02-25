package com.shivam.springdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("mortalKombat")
@PropertySource("classpath:application.properties")
public class MortalKombat implements Game {

	@Value("${mortalKombat.player1}")
	private String player1;

	@Value("${mortalKombat.player2}")
	private String player2;


	@Override
	public void play() {
		System.out.println("-----------------------------------" );
		System.out.println("Game : Mortal Kombat" );
		System.out.println("Round 1  Fatality Mode : "+ player1 +" vs "+ player2 );
		System.out.println("-----------------------------------" );


	}

}
