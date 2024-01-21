package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContract;

public class AppGamingBasic3 {
public static void main(String[] args) {
	try(var context =  new AnnotationConfigApplicationContext(GamingConfigration.class)){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}
       //var game = new MarioGame();
	//var superContract = new SuperContract();
	//var gameRunner = new GameRunner(game);
	//gameRunner.run();
}
}

