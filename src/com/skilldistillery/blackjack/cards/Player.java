package com.skilldistillery.blackjack.cards;

public class Player {
	// Has-A hand
	private BlackjackHand playerHand;
	
	

	public BlackjackHand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}

	@Override
	public String toString() {
		return "Player has current value of " + playerHand + " in hand";
	}
	
	
	
}
