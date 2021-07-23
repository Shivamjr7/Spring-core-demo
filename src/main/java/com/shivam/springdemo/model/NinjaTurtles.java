package com.shivam.springdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ninja")
public class NinjaTurtles implements Game {

	@Override
	public void play() {

		System.out.println("Stage 1 TMNT : Ralph and Don against the Shredder");

	}

}
