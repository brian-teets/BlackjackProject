package com.skilldistillery.blackjack;

public class BlackjackApplication {

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run(); 

	}
	
	public void run() {
		gameGreeting();
		// TODO: upon new game, call dealNewHand() and deal to player and dealer 
		
	}
	
	public void gameGreeting() {
		System.out.println();
		System.out.println("       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("       $                           $");
		System.out.println("       $                           $");
		System.out.println("       $    Blackjack Simulator    $");
		System.out.println("       $                           $");
		System.out.println("       $                           $");
		System.out.println("       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
	}
	
	public void gameSimulator() {
		
	}

}
