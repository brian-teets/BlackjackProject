package com.skilldistillery.blackjack.cards;

import java.util.List;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		
	} 

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : handOfCards) {
			total += card.getValue();
		}
		return total; 
	}
	
	@Override
	public void addCard(Card card) {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public boolean isBust() { 
		// When either the player's hand OR the dealer's hand goes over value of 21
		
		
		return false;
	}
	
//	public boolean isBlackjack() { // stretch goal 
//		// source: Blackjack wiki 
//		/*
//		 * A player total of 21 on the first two cards is a "natural" or "blackjack," 
//		 * and the player wins immediately unless dealer also has one, in which case the hand ties. 
//		 * In the case of a tie ("push" or "standoff"), bets are returned without adjustment. 
//		 * But a blackjack beats any hand that is not a blackjack, even one with a value of 21.
//		 */
//		
//		return false; 
//	}

} // end of class 
