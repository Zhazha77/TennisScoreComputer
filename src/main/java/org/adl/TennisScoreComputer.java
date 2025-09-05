package org.adl;

import org.adl.state.GameState;
import org.adl.state.RegularState;

public class TennisScoreComputer {

    private GameState gameState;
    private int playerAPoints =  0;
    private int playerBPoints = 0;

    public TennisScoreComputer() {
        this.gameState = new RegularState(this);
    }

    public void pointWonBy(char player) {
        if (player == 'A') {
            onAWon();
        }
        else {
            onBWon();
        }
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
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
}
