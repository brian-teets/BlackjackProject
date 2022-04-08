## Getting started with Blackjack

Let's think about the class structure. The fundamental element of a blackjack game is a deck of cards. Decks are made up of 52 cards, so we can make a class that is a card element which consists of a suit and rank. Within this class wouldn't a deck be a collection of 52 card objects? Feel free to look at the labs from last week where you sorted a deck of cards to get a feel for the basic elements.

In a game of blackjack the dealer and a player have a hand of cards. A hand of cards is just the cards that have been dealt to an individual (and thus removed from the deck). This could be a class as well that would consist of a collection type to store the currently dealt cards of each player.

Other card games have hands that work differently.  Is there an application for a hand interface, and perhaps an abstract implementation that could be subclassed for different card games?

You will need to implement methods in each of these classes that mimic the functionality of a game of blackjack. Decks need to be able to be shuffled, as well as be able to deal and remove cards. Hands need to be able to add cards, calculate their current value (in accordance to the rules of blackjack), and display themselves.

A player holds and plays a hand.  A dealer holds a hand, but has some special rules on how they play.  Think about using an interface that is implemented by both player and dealer.

The actual 'game logic' associated with testing scores, deciding when you can and cannot hit or stay, betting rules if you so choose to add this functionality should all be written outside of the core classes. You can create a test or play class which stores the logic as well as a main class to launch it.

<hr> 