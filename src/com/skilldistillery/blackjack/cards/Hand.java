package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {
	
	protected List<Card> handOfCards;

	public Hand(List<Card> handOfCards) {
		this.handOfCards = handOfCards;
	}
	
	public void addCard(Card card) { } // add a card to handOfCards being played 
	
	public void clear() { }
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Player has a current value of " + handOfCards + " in hand";
	}
	
}
