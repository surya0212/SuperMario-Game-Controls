package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {
   
	public void up() {
		System.out.println("The Up is to :jump");
	}
	public void down() {
		System.out.println("The DOWN is to:Tunnel");
	}
	public void left() {
		System.out.println("The Left is to:Return");
	}
	public void right() {
		System.out.println("The roght is to:Move Forward");
	}
}