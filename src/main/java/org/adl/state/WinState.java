package org.adl.state;

import org.adl.TennisScoreComputer;

public class WinState extends GameState {
    public WinState(TennisScoreComputer context) {
        super(context);
    }

    @Override
    public String AMarksAPoint() {
        return "";
    }

    @Override
    public String BMarksAPoint() {
        return "";
    }

    @Override
    public void PrintScore() {
        System.out.printf("Player %s wins the game\n", context.getPlayerAPoints() > context.getPlayerBPoints() ? "A" : "B");

    }
}
