package com.skilldistillery.blackjack.cards;

public class Dealer {
	// Has-A hand
	
	private BlackjackHand dealerHand;
	
	

	public Dealer(BlackjackHand dealerHand) {
		this.dealerHand = dealerHand;
	}

	public BlackjackHand getDealerHand() {
		return dealerHand;
	}

	public void setDealerHand(BlackjackHand dealerHand) {
		this.dealerHand = dealerHand;
	}

	@Override
	public String toString() {
		return "Dealer has current value of " + dealerHand; 
	}
	
	
	
	
}
