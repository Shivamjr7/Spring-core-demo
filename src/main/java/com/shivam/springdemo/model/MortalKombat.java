package com.shivam.springdemo.model;

import org.springframework.stereotype.Component;

@Component("mortalKombat")
public class MortalKombat implements Game {

	@Override
	public void play() {

		System.out.println(" 1st round : Lui Kang is fighting Scorpion ");
		System.out.println(" Fatality mode ...");

	}

}
