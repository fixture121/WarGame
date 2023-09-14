package wargame;

/**
 * @authors dancye, Paul Bonenfant JAN 2020
 * @authors Toufiq Charania, Julian Menegon, Mariah Falzone, Yassine Assim
 *          AUG 2023
 * 
 *          A class to be used as the base Card class for the project. Must be
 *          general enough to be instantiated for any Card
 *          game. Students wishing to add to the code should remember to add
 *          themselves as a modifier.
 */

public class Card {

    private final String rank; // Rank constant
    private final String suit; // Suit constant

    // Card Object with parameters needed to define the card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Create getters for the two variables but not setters as the variables are final and will be defined
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // toString method used to display the rank and suit of the Card when displayed in the game
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    
}
