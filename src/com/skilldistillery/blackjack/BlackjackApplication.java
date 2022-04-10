package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Player;

public class BlackjackApplication {

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run(); 

	}
	
	public void run() {
		gameGreeting();
		// TODO: upon new game, call dealNewHand() and deal to player and dealer 
		gameSimulator();
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
		Dealer dealer = new Dealer();
		Player player = new Player();
		System.out.println("The dealer will deal you 2 cards to begin the game.");
		System.out.println("Dealing now... ");
		System.out.println();
		dealer.getDeck();
		dealer.shuffleDeck();
		dealer.dealNewHandToPlayer(player); 
		System.out.println("Now the dealer will deal to himself.");
		dealer.dealNewHandToDealer(dealer);
		
		
	}

}
