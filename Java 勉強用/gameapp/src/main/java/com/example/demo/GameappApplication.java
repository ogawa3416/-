package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameappApplication.class, args);
		GameappApplication app = new GameappApplication();
		app.trump();
	}

	public void trump() {
		Deck deck = new Deck();
		Run.battle2(deck);

		System.out.println(Run.output);
	}
}
