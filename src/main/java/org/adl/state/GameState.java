package org.adl.state;

import org.adl.TennisScoreComputer;

public abstract class GameState {
    protected TennisScoreComputer context;

    public GameState(TennisScoreComputer context) {
        this.context = context;
    }

    public abstract String AMarksAPoint();
    public abstract String BMarksAPoint();

    public void PrintScore() {
        System.out.printf("Player A : %d / Player B : %d\n", context.getPlayerAPoints(), context.getPlayerBPoints());
    }
}
