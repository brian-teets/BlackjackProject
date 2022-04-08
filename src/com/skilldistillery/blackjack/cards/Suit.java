package com.skilldistillery.blackjack.cards;

public enum Suit {
//	Constants must be declared first 
	
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");

	Suit(String s) {
		name = s;
	}
	
	final private String name;
	
	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}
	
}
