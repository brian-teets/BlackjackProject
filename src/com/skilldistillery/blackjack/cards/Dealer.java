package com.skilldistillery.blackjack.cards;

public class Dealer {
	// Has-A hand
	
	private Deck deck;
	private BlackjackHand dealerHand;
	
	

	public Dealer() {
		this.deck = new Deck();
		this.dealerHand = new BlackjackHand(); 
		
	}

	public BlackjackHand getDealerHand() {
		return dealerHand;
	}
	
	public Deck getDeck() {
		return deck;
	}


	@Override
	public String toString() {
		return "Dealer has current value of " + dealerHand; 
	}
	
	
}
