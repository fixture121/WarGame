package wargame;

import java.util.ArrayList;

/**
 * @authors dancye, Paul Bonenfant JAN 2020
 * @authors Toufiq Charania, Julian Menegon, Mariah Falzone, Yassine Assim
 *          AUG 2023
 */

public abstract class Game {

    private final String name; // The title of the game
    private ArrayList<Player> players; // The players of the game to be stored in an ArrayList

    // Constructor to set name and add player to players ArrayList
    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    // Return the name
    public String getName() {
        return name;
    }

    // Return the players of this game
    public ArrayList<Player> getPlayers() {
        return players;
    }

    // Set players
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    // Play the game
    public abstract void play();

    // Display the winning player when game is over
    public abstract void declareWinner();

} // End class
