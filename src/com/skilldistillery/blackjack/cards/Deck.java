package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;
	
	public Deck() {
		deck = createDeck();
	}

	public List<Card> createDeck() {
		deck = new ArrayList<>(52);

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(suit, rank));
			}
		}
		return deck;
	}
	
	public int checkDeckSize() {
		return deck.size();
	}
	
	public Card dealCard() {
		return deck.remove(0);
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deck); 
	} 
	
	public void clearDeck() {
		deck.removeAll(deck);
	}

}
