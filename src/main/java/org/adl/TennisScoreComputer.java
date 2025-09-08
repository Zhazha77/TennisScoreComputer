package org.adl;

import org.adl.state.AbstractState;
import org.adl.state.RegularState;

public class TennisScoreComputer {

    private AbstractState gameState;
    private int playerAPoints =  0;
    private int playerBPoints = 0;

    public TennisScoreComputer() {
        this.gameState = new RegularState(this);
    }

    public void computeScore(String match) {
        for (char player :  match.toCharArray()) {
            this.gameState = pointWonBy(player);
            System.out.println(this.getScore());
        }
    }

    public AbstractState pointWonBy(char player) {
        if (player == 'A') {
            return onAWon();
        }
        else {
            return onBWon();
        }
    }

    public AbstractState onAWon() {
        playerAPoints++;
        return gameState.AMarksAPoint();
    }

    public AbstractState onBWon() {
        playerBPoints++;
        return gameState.BMarksAPoint();
    }

    public int getPlayerAPoints() {
        return playerAPoints;
    }

    public int getPlayerBPoints() {
        return playerBPoints;
    }

    public String getScore() {
        return this.gameState.getScore();
    }
}
