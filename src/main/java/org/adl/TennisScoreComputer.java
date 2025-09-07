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
            this.pointWonBy(player);
        }
    }

    public void pointWonBy(char player) {
        if (player == 'A') {
            onAWon();
        }
        else {
            onBWon();
        }
    }

    public void onAWon() {
        playerAPoints++;
    }

    public void onBWon() {
        playerBPoints++;
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

    public void setGameState(AbstractState gameState) {
        this.gameState = gameState;
    }
}
