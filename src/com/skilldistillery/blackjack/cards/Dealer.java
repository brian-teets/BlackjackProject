package com.skilldistillery.blackjack.cards;

public class Dealer extends Player {
	// Has-A hand
	
	private Deck deck;
	
	
	public Dealer() {
		Dealer dealer = new Dealer();
		this.deck = new Deck();
		playerHand = new BlackjackHand();  
	}

	public BlackjackHand getDealerHand() {
		return playerHand; 
	}
	
	public void getDeck() {
		deck.createDeck();
	}
	
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
	public void dealNewHand(Player player) { // per Blackjack rules, player and dealer begin with 2 cards 
		for(int i = 0; i < 2; i ++) {
			player.addToHand( deck.dealCard() );  
		}
	}
	
	public void dealACard(Player player) {
		player.addToHand( deck.dealCard() ); 
	}
	
	public void clearDeck() {
		deck.clearDeck();
	}

	@Override
	public String toString() {
		return "Dealer has current value of " + playerHand; 
	}
	
}
