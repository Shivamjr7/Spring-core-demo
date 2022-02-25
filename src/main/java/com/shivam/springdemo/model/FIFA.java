package com.shivam.springdemo.model;

public class FIFA implements Game {

    private String team1;
    private String team2;

    //constructor injecting using xml file
    FIFA(String team1, String team2) {
        System.out.println("Setting property of teams");
        this.team1 = team1;
        this.team2 = team2;

    }

    @Override
    public void play() {
		System.out.println("-----------------------------------" );
    	System.out.println("Game : FIFA" );
        System.out.println("UEFA Champions league final : " + team1 + " vs " + team2);
		System.out.println("-----------------------------------" );
    }

}
