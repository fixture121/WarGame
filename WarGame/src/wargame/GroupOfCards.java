package wargame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @authors dancye, Paul Bonenfant JAN 2020
 * @authors Toufiq Charania, Julian Menegon, Mariah Falzone, Yassine Assim
 *          AUG 2023
 * 
 *          A concrete class that represents any grouping of cards for a Game.
 *          HINT, you might want to subclass this more than
 *          once. The group of cards has a maximum size attribute which is
 *          flexible for reuse.
 * 
 *          Modified Code by GitGood Group
 */

public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private final ArrayList<Card> cards;

    // Group of Cards Object
    public GroupOfCards() {
        // Making new ArrayList called cards
        cards = new ArrayList<>();
    }

    /**
     * A method that will get the group of cards as an ArrayList and to store multiple cards dynamically
     * @return the group of cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    // Method to populate the Deck with the suits and rank of a standard 52 card deck
    public void populateDeck() {
        // Created arrays with the final elements
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // For Loop to produce all possible variations of a card in a deck
        for (String suit : suits) { // For a String called suit will be assigned an element from suits array
            for (String rank : ranks) { // A string called rank will be assigned an element from ranks array
                cards.add(new Card(rank, suit)); // Array list cards will add new items from the Card object
            }
        }
    }

    // Shuffle method utilizes the collections to randomly arrange the array list in one line of code instead of using Random
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
}
