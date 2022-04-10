package com.skilldistillery.blackjack.cards;

public class Dealer extends Player {
	
	private Deck deck;
	
	
	public Dealer() {
		this.deck = new Deck();
		this.playerHand = new BlackjackHand(); 
	}

	public BlackjackHand getDealerHand() {
		return playerHand; 
	}
	
	public void getDeck() {
		deck.createDeck();
	}
	
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
	public void dealNewHandToPlayer(Player player) { 
		// per Blackjack rules, player and dealer begin with 2 cards 
		for(int i = 0; i < 2; i ++) {
			player.addToHand( deck.dealCard() );  
		}
		System.out.println("Player has " + this.playerHand);
	}
	
	public void dealNewHandToDealer(Player player) { 
		// per Blackjack rules, player and dealer begin with 2 cards 
		for(int i = 0; i < 2; i ++) {
			player.addToHand( deck.dealCard() );  
		}
		System.out.println("Dealer has " + 
		this.playerHand.handOfCards.get(1)); 
		// trying to only show dealer's second card 
	}
	
	public void dealACard(Player player) {
		player.addToHand( deck.dealCard() ); 
	}
	
	public void clearDeck() {
		deck.clearDeck();
	}
	
	public void clearDealerHand() {
		this.playerHand.clear();
	}
	
	public void getDealerHandValue() {
		this.playerHand.getHandValue();
	}

	@Override
	public String toString() {
		return "Dealer has current value of " + playerHand; 
	}
	
}
