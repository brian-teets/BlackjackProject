package com.skilldistillery.blackjack.cards;

public class Player {
	// Has-A hand
	protected Hand playerHand;
	
	public Player() {
		this.playerHand = new BlackjackHand(); 
	}

	public BlackjackHand getPlayerHand() {
		return (BlackjackHand)playerHand; 
	}
	
	public void addToHand(Card card) {
		playerHand.addCard(card);
	}
	
	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	
	public int getPlayerHandValue() {
		int total = this.playerHand.getHandValue(); 
		return total;
	}
	
	public void clearPlayerHand() {
		this.playerHand.clear();
	}
	
	public String displayPlayerHand() {
		return "Player1 currently has " + playerHand.getHandValue(); 
	}

	@Override
	public String toString() {
		return "Player1 has " + playerHand.getHandValue() + " in hand";
	}
}