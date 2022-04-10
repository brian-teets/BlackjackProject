package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Player;

public class BlackjackApplication {

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run();

	}

	public void run() {
		gameGreeting();
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
		System.out.println();
	}

	public void gameSimulator() {
		boolean keepGoing = true;
		Scanner scanner = new Scanner(System.in);
		Dealer dealer = new Dealer();
		Player player = new Player();
		System.out.println("The dealer will deal you 2 cards to begin the game.");
		System.out.println("Dealing now... ");
		System.out.println();
		dealer.getDeck();
		dealer.shuffleDeck();
		dealer.dealNewHandToPlayer(player); 
		System.out.println();
		System.out.println("Now the dealer will deal to self.");
		dealer.dealNewHandToDealer(dealer);
		System.out.println();
		
		while(keepGoing) {
			if (player.getPlayerHandValue() == 21 || dealer.getDealerHandValue() == 21) {
				int winnerValue = 0;
				if (player.getPlayerHandValue() > dealer.getDealerHandValue()) {
					winnerValue = player.getPlayerHandValue();
					System.out.println("Player1 won with " + winnerValue);

				} 
				else if (dealer.getDealerHandValue() > player.getPlayerHandValue()){
					winnerValue = dealer.getDealerHandValue();
					System.out.println("Dealer won with " + winnerValue); 
				}
			}
			else if(player.getPlayerHandValue() < 21 || dealer.getDealerHandValue() < 21){
				System.out.println("Player1 has " + player.getPlayerHandValue() 
				+ ". Player1, do you want to hit or stay? " + " Enter either (Hit, or Stay)  ");
				System.out.println();
				String userInput = scanner.nextLine();
				if(userInput.equalsIgnoreCase("hit")) {
					dealer.dealACard(player);
					System.out.println( "Player1's new hand value is " + player.getPlayerHandValue() );
					player.getPlayerHand().isBust();
					System.out.println();
				}
				if(userInput.equalsIgnoreCase("stay")) {
					System.out.println( "Player1 has chosen to stay. Player's current hand value is " 
				+ player.getPlayerHandValue()); 
				}
				if(dealer.getDealerHandValue() < 17) {
					System.out.println();
					System.out.println("Dealer's hand value is " + dealer.getDealerHandValue() + ", so dealer must hit.");
					dealer.dealACard(dealer);
					System.out.println("Dealer's new value is " + dealer.getDealerHandValue());
				}
				else if(dealer.getDealerHandValue() >= 17) {
					System.out.println();
					System.out.println("Dealer's current hand value is " + dealer.getDealerHandValue());
					System.out.println();
				}
			}
			scanner.close(); 
			
		} // end of while loop

	} // end of gameSimulator method 

}
