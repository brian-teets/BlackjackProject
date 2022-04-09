package com.skilldistillery.blackjack.cards;

public class Player {
	// Has-A hand
	private BlackjackHand playerHand;
	
	public Player() {
		this.playerHand = new BlackjackHand(); 
	}

	public BlackjackHand getPlayerHand() {
		return playerHand;
	}
	
	public void addToHand(Card card) {
		playerHand.addCard(card);
	}
	
	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	
	public void displayPlayerHand() {
		System.out.println( playerHand.toString() + " currently has " + playerHand.getHandValue() ); 
	}

	@Override
	public String toString() {
		return "Player has current value of " + playerHand + " in hand";
	}
	
}
