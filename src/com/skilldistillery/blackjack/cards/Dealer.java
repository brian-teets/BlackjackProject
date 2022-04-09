package com.skilldistillery.blackjack.cards;

public class Dealer {
	// Has-A hand
	
	private Deck deck;
	private BlackjackHand dealerHand;
	
	public Dealer() {
		Dealer dealer = new Dealer();
		this.deck = new Deck();
		this.dealerHand = new BlackjackHand(); 
	}

	public BlackjackHand getDealerHand() {
		return dealerHand; 
	}
	
	public void getDeck() {
		deck.createDeck();
	}
	
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
	public void dealNewHand() { // per Blackjack rules, player and dealer begin with 2 cards 
		
	}
	
	public void dealACard(Player player) {
		player.addToHand( deck.dealCard() ); 
	}
	
	public void clearDeck() {
		deck.clearDeck();
	}

	@Override
	public String toString() {
		return "Dealer has current value of " + dealerHand; 
	}
	
}
