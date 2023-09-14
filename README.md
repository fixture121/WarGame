# WarGame - SYST17796 Fundamentals of Software Design
A Java-based War card game

Project Background and Description

The goal of our assignment is to create a java program that allows users to play the classic game “War” as well as allowing for the code to be reused for other card games if required. The program will allow for a deck of cards containing 13 hearts, 13 spades, 13 clubs, and 13 diamonds of which there will be holding the values of 2, 3, 4, 5, 6, 7, 8, 9, Jack, Queen, King and Ace ranking from lowest to highest value, respectively. The deck is split evenly between the number of players that the program is set to (Bicycle, n.d.).

Each player turns up a card at the same time and the player with the higher card wins the round, each win will be recorded either for the user or the computer (Bicycle, n.d.). Players can play all 26 rounds, or can end the game early as per their choice, the player with the most rounds won wins the game. In the case that the overturned cards match, the players go to war (Bicycle, n.d.). Now, “each player turns up one card face down and one card face up. The player with the highest cards takes both piles (six cards)” (Bicycle, n.d.). Again, if the turned over cards match in rank, “each player places another card face down and turns another card face up” (Bicycle, n.d.).

Relating to the code itself, the base code that was provided for the assignment was 4 java classes labelled, Card, Game, GroupOfCards, and Player, all of which hold different methods and variables in order to execute a card game such as War.
	
First, the card class contains an abstract Card class with an overridden toString method, nothing is actually written in these two methods. The Card class will require an implementation that is general so that it can apply to all card games, which means that our group will aim to set variables such as the different suits and the card types will be present here. Getters and setter methods will be used to change and return the variables that we have set in this class, and likely this will be a super class to another one of the Java classes obtained. The overridden toString method will return an object as a string, and this will likely be used for the suits and card values.

Second, the Game class imports the ArrayList which will allow the use of dynamic arrays allowing for our group to store and manipulate a collection of objects. So far, there is a final variable for the name of the game as well as declaring a private instance variable named players which is going to record the number of players in our card game. There are Player getters and setters to return the number of players as an ArrayList, as well as a Game getter and setter to set the name of the game of our choosing. This class will also be used to play the game as there is a play method as well as a declareWinner class that will be called upon when declaring the winner.

The third class labelled GroupOfCards, there is another ArrayList imported as well as a Collection import, the ArrayList import is again meant to be for the arrays being used in the class, however, the Collection import allows for the methods such as add(), remove(), contain(), etcetera, to be called into the class that is being used. Overall, this class would be used to shuffle cards and select the random cards from the stored decks of each player. This class will also be used to show how many cards are in each player deck.

Finally the Player class is being used to track the players and their usernames. There is a getter and setter for the username, which allows us to set the username as well as call on the value for reference in our game, and displays the name as a String as this is the consistent parameter throughout each method. There is also another play method, in this case an abstract class. This method will be overridden by a subclass of the Player class, with Java code that will describe the different types of Players that can play the game, for instance a player and the computer. More specifically, it will be used to specify the behaviour of each player during their turn. For example, this would be used for comparing card values, selecting cards, and other decisions players can make based on the game rules.However, this portion will likely be removed for our game because of the game parameters we have set. Those parameters do not allow for the user to choose their next card, compare their card etc.

The provided base code is written in Java and follows the object-oriented programming principles. It includes classes such as Card, Game, GroupOn Cards, and Player, which form the foundation for building card games of any type. The code utilizes abstract methods, inheritance, and encapsulation to create a modular and reusable structure. It adheres to coding conventions such as employing naming convention, getter and setter methods, and appropriate use of data structures like ArrayLists.

Resources
Bicycle Cards. (n.d.) Learn to Play War. Accessed from https://bicyclecards.com/how-to-play/war 



Project Scope

There are four individuals in our team, Mariah, Toufiq, Julian and Yassine. For Deliverable 1, we have assigned the following roles:
  Mariah is responsible for part 3 of the design document template. Mariah created the team’s GitHub repository and provided access to the team to push their changes.
  Toufiq is responsible for part 2 and 4 of the design document template.
  Julian is responsible for part 1 of the design document template.
  Yassine is responsible for part 5 design document template.

The four of us will interface through Discord calls and a Discord group chat, as well as in person meetings. Additionally, for future deliverables our group will start with an initial meeting to discuss the scope and roles of each member. We will divide the work up evenly, and provide assistance to one another when needed. Each of us will ask questions and provide progress updates to the team about our individual portion of the project. The group leader will set deadlines for different parts of the project, in order to review progress and submit each deliverable on time.

The group will know when the project is complete, when all aspects of our code works in a test run, and we are able to play the game of War without any disruptions. 



High-Level Requirements

The new system must include the following:
  Ability for the player to enter a custom name for the game 
  Ability for the game to distribute 26 cards to each player without repeats
  Ability for the game to communicate when the same rank is placed
  Ability for the game to communicate who won each hand 
  Ability for the game to communicate how many cards the players have every hand
  Ability for the players to know their status at all times
  Ability for the game to communicate wins or losses
  Ability for the player to quit the game before it is finished



Implementation Plan

GitHub repository URL: https://github.com/tobeytheghost/SYST17796_Deliverable.git

Each team member has full access, including the ability to push their local repository files to GitHub. Each team member will work on their part of the project and share with the group their code prior to pushing any changes to ensure accuracy of work. Once ready, all team members will then push their local repository to their GitHub branch to save changes. Once all code is ready for the final files, all team members will merge their branches.

UML diagrams will be created by all four group members using Visual Paradigm and will be stored on a shared Google Drive. Each member’s input will be saved in their own folders and later combined for the final product.

Our team will follow proper Java conventions and object-oriented principles. All source code will include JAVADOC commentary that tells other programmers what the code does and how the functions are intended to be implemented. When creating formal documentation, APA rules will be followed.

The tools that will be used include IDEs, such as NetBeans, and computer assisted software engineering tools, such as Visual Paradigm. GitHub will be utilized to save code files.



Design Considerations

The current code is structured with the following object-oriented principles: encapsulation, delegation and flexibility/maintainability.

The encapsulation principle is used in the Player.java class. The code encapsulates the players name within a private instance variable called ‘name’. This variable is accessed through getName() and setName() methods. It ensures that the variable is accessed/modified only through the methods. Additionally, encapsulation is used in the GroupsOfCards class. The class encapsulates a group of cards within a private instance called ‘cards’. The getter method ‘getCards()’  is used to get controlled access to the ‘cards’ list. Internal implementation hidden and access to cards is provided through methods.

The Games class delegates implementation of gameplay logic and declares a winner to its subclasses. There is a declaration of abstract methods “play()” and “declareWinner()” which are meant to be overridden by child classes that extend the “Game” class. The delegation principle allows for subclasses to define specific gameplay rules/winning conditions while using common functionalities of the “Game” class. Additionally, the class “GroupofCards” delegates the task of shuffling cards to the “collections.shuffle()” method. The “shuffle()” method is used internally to shuffle cards within “ArrayList”. The code benefits from delegation of implementation provided by the library which ensures randomness and efficiency of shuffle.

The code uses flexibility/maintainability through the use of abstraction in Game.java, Card.java and Player.java classes and the abstract play(), declareWinner() and toString() methods. These methods provide a base structure that is customizable and extendable by subclasses. It allows for easier maintenance and modification of code by defining common behaviours and requirements in abstract classes.
	
Encapsulation:
The Player.java class encapsulates the players name within a private instance variable called ‘name’. It can access this variable through getName() getter and setName() setter. It ensures that the variable is accessed/modified only through these methods.
GroupOfCards class encapsulates a group of cards within a private instance called ‘cards’. Use the getter method ‘getCards()’  to get controlled access to ‘cards’ list. Internal implementation hidden and access to cards is provided through methods.

Delegation:
‘Game’ class delegates implementation of gameplay logic and declares a winner to its subclasses. Declares abstract methods ‘play()’ and ‘declareWinner()’, which are meant to be overridden by child classes that extend ‘Game’.java. Allows for subclasses to define specific gameplay rules / winning conditions while using common functionalities of the ‘Game’ class.
‘GroupOfCards’ delegates the task of shuffling cards to the ‘Collections.shuffle()’ method. Uses ‘shuffle()’ internally to shuffle cards within ‘ArrayList’.Code benefits from delegation of implementation provided by library which ensures randomness / efficiency of shuffle.

Flexibility/Maintainability:
Code uses abstraction through Game.java, Card.java, and Player.java classes and abstract methods play(), declareWinner(), and toString() to provide a base structure that is customizable/extendable by subclasses. Allows for easier maintenance and modification of code by defining common behaviours/requirements in abstract classes.
