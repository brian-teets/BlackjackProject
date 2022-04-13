# Blackjack Application

### Week 4 - Weekend Homework Project for Skill Distillery

### Application Overview 

Use classes to create a functional command line blackjack game. Leave the game's functionality until the end, first get the class structure figured out. From here you can implement methods and fields to store data you think you would need during a blackjack game. To help get started, read through the rules [here][wiki]. 

A Blackjack [UML Diagram](/BlackjackUML.pdf) was provided as a starting point. But, this will need to be expanded on. 

### Learning Objectives

Below are a list of objectives that we see the blackjack programming project reinforcing.

* Getting comfortable building classes in an Object-Oriented manner.  
* Building classes whose fields are Objects.  
* Practice writing methods.  
* Use collection types to organize and manage data.  
* Use conditionals to create game logic. 

#### User Story #1
Create a class structure that mimics a deck of cards. Remember decks as well as hands are made up of cards. Feel free to create the structure in any way you see fit.

Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

#### User Story #2
Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck. You should be able to print out a shuffled deck to the terminal.

#### User Story #3
Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the [wiki][wiki].

Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

#### User Story #4
The Dealer's decisions are based on game logic in the program.

The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.

#### User Story #5
Determine the winner of each round by implementing the remaining rules of Blackjack (such as going over 21) and comparing hand values.

### Grading Criteria
This is a graded project. You are expected to have your project completed by the start of class on Monday morning.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

* Your program must **NOT** be contained in one procedural main(). You **MUST** design a OO class structure.  

* When the game begins both the player and dealer are dealt two cards.  

* If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to hit as many times as they wish until they choose to stay.  

* Once the player has completed their turn the dealer will begin their turn, automatically hitting or staying according to the Blackjack rules.  

* The game is immediately over if either player gets above 21.  

* The winner is displayed. 

### How To Run The Program

* It is assumed the user has an IDE, such as Eclipse. 
* Download and install the .java file to local Eclipse workspace.
* Run the program

	* The player and dealer and both dealt 2 cards in alternating fashion. 
		* Then, the program evaluates the total hand value of both player and dealer. 
		* If the starting hand value of the player OR dealer equals exactly 21, then a winner is declared and the round is over.
		* If a winner is not yet declared, then game play continues.
	* The player decides whether to hit(take another card) or stay(and not take another card yet).
	* Player's round of play continues until choosing to `stay`.
	* Dealer's hand value is revealed. If dealer's hand value is under 17, then dealer must hit. 
	* Conditional logic checks if dealer or player busted, depending on who is in play. 
	* A winner / loser is declared. 
	* The player may choose to play another round. 
		

### Technologies / Skills Used 

* Java
* OO class structure
* Eclipse
* git 
* GitHub 
* Slack
* Zoom  

### Lessons Learned 

* I gained practice working with classes and practicing intentionality with building structure in an Object-Oriented manner.
* I knew very little about Blackjack before. While I am still no expert by any stretch of the imagination, this project has challenged me to implement Java conditionals and class structure to create game logic. 
* I gained practice using nested while loops and creating break points.  

[wiki]: https://en.wikipedia.org/wiki/Blackjack