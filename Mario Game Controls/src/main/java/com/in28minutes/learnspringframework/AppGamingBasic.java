package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContract;

public class AppGamingBasic {
public static void main(String[] args) {
       var game = new MarioGame();
	//var superContract = new SuperContract();
	var gameRunner = new GameRunner(game);
	gameRunner.run();
}
}
