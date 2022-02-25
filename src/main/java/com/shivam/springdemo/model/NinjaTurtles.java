package com.shivam.springdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ninja")
public class NinjaTurtles implements Game {

	@Override
	public void play() {
		System.out.println("-----------------------------------" );
		System.out.println("Game : Teenage Mutant Ninja Turtles" );
		System.out.println("Stage 1 TMNT : Ralph and Don against the Shredder");
		System.out.println("-----------------------------------" );
	}

}
