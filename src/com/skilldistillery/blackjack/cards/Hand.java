package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {

	protected List<Card> handOfCards;

	public Hand() {
		
	}

	public void addCard(Card card) {
		handOfCards.add(card);
	} // add a card to handOfCards being played

	public void clear() {
		handOfCards.removeAll(handOfCards);
	}

	public List<Card> getHandOfCards() {
		return handOfCards; 
	}

	public void setHandOfCards(List<Card> handOfCards) {
		this.handOfCards = handOfCards;
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "current value of " + handOfCards + " in hand";
	}

}
