package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;

@Configuration
public class GamingConfigration {

	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	@Bean 
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner =  new GameRunner(game);
		return gameRunner;
	}
}
