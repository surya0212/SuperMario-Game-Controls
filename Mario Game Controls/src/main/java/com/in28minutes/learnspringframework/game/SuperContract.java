package com.in28minutes.learnspringframework.game;

public class SuperContract implements GamingConsole {
	public void up() {
		System.out.println("jump");
	}
	public void down()
	{
		System.out.println("go into the hole");
		}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("accerlate");
	}
}
