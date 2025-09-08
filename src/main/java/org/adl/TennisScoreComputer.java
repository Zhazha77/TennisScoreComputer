package org.adl;

import org.adl.state.AbstractState;
import org.adl.state.RegularState;

public class TennisScoreComputer {

    private AbstractState gameState;
    private int playerAPoints =  0;
    private int playerBPoints = 0;

    /**
     * Class for computing tennis match score.
     */
    public TennisScoreComputer() {
        this.gameState = new RegularState(this);
    }

    /**
     * Compute a tennis game from the given sequence and prints the score between each point 'A' and 'B'.
     * @param match String reprensenting the sequence of points
     */
    public void computeScore(String match) {
        for (char player :  match.toCharArray()) {
            this.gameState = pointWonBy(player);
            System.out.println(this.getScore());
        }
    }

    /**
     *  Add a point for the specified player to the computing system
     * @param player character representing the player who won the point
     * @return the state in which the game is after the point is marked
     */
    public AbstractState pointWonBy(char player) {
        if (player == 'A') {
            return onAWon();
        }
        else {
            return onBWon();
        }
    }

    /**
     * Handles the event of player A marking the point
     * @return the state in which the game is after the point is marked
     */
    public AbstractState onAWon() {
        playerAPoints++;
        return gameState.AMarksAPoint();
    }

    /**
     * Handles the event of player B marking the point
     * @return the state in which the game is after the point is marked
     */
    public AbstractState onBWon() {
        playerBPoints++;
        return gameState.BMarksAPoint();
    }

    /**
     * Getter for playerAPoints property
     * @return count of player A marked points
     */
    public int getPlayerAPoints() {
        return playerAPoints;
    }

    /**
     * Getter for playerAPoints property
     * @return count of player B marked points
     */
    public int getPlayerBPoints() {
        return playerBPoints;
    }

    /**
     * Get the String representation of the game score depending on game state.
     * @return String representation of the game score.
     */
    public String getScore() {
        return this.gameState.getScore();
    }
}
