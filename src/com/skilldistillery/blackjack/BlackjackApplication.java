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
		String keepPlaying = "Y";
		while (!keepPlaying.equalsIgnoreCase("N")) {
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

			boolean keepGoing = true;

			while (keepGoing) {

				if (player.getPlayerHandValue() == 21 || dealer.getDealerHandValue() == 21) {
					int winnerValue = 0;
					if (player.getPlayerHandValue() > dealer.getDealerHandValue()) {
						winnerValue = player.getPlayerHandValue();
						System.out.println("Player1 won with " + winnerValue);
						System.out.println("Restart the game to play again.");
						keepGoing = false;
					} else if (dealer.getDealerHandValue() > player.getPlayerHandValue()) {
						winnerValue = dealer.getDealerHandValue();
						System.out.println("Dealer won with " + winnerValue);
						System.out.println("Restart the game to play again.");
						keepGoing = false;
					}
				} else if (player.getPlayerHandValue() < 21 || dealer.getDealerHandValue() < 21) {
					System.out.println("Player1 has " + player.getPlayerHandValue()
							+ ". Player1, do you want to hit or stay? " + " Enter either (Hit, or Stay)  ");
					System.out.println();
					String userInput = scanner.nextLine();
					if (userInput.equalsIgnoreCase("hit")) {
						dealer.dealACard(player);
						System.out.println("Player1's new hand value is " + player.getPlayerHandValue());
						if (player.getPlayerHand().isBust() == true) {
							System.out.println("Sorry Player, you busted!");
							System.out.println("Restart the game to play again.");
							keepGoing = false;
						}
						System.out.println();
					}
					if (userInput.equalsIgnoreCase("stay")) {
						System.out.println("Player1 has chosen to stay. Player's current hand value is "
								+ player.getPlayerHandValue());
						System.out.println("Dealer's current hand value is " + dealer.getDealerHandValue());

					}
					if (dealer.getDealerHandValue() < 17) {
						System.out.println();
						System.out.println(
								"Dealer's hand value is " + dealer.getDealerHandValue() + ", so dealer must hit.");
						dealer.dealACard(dealer);
						System.out.println("Dealer's new value is " + dealer.getDealerHandValue());
						if (dealer.getDealerHand().isBust() == true) {
							System.out.println("Dealer busted. You win.");
							System.out.println("Restart the game to play again.");
							keepGoing = false;
						}

					} else if (dealer.getDealerHandValue() >= 17) {
						System.out.println();
						System.out.println("Dealer's current hand value is " + dealer.getDealerHandValue() + ", so dealer must stay.   ");
						if (dealer.getDealerHand().isBust() == true) {
							System.out.println("Dealer busted. You win.");
							System.out.println("Restart the game to play again.");
							keepGoing = false;
						}
						System.out.println();
					}

				}
			} // end of inner while loop 

			System.out.println("Do you want to play again?  (Y / N)   ");
			keepPlaying = scanner.nextLine();
			if (keepPlaying.equalsIgnoreCase("N")) {
				System.out.println("==============Goodbye!===============");
				keepPlaying = "N";
			} else if (keepPlaying.equalsIgnoreCase("Y")) {
				keepPlaying = "Y";
			}
			scanner.close();
		} // end of outer while loop

	} // end of gameSimulator method

}
