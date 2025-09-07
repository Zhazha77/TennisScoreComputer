package org.adl.state;

import org.adl.TennisScoreComputer;

public class WinState extends AbstractState {
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
    public String getScore() {
        return String.format("Player %s wins the game", context.getPlayerAPoints() > context.getPlayerBPoints() ? "A" : "B");
    }
}
