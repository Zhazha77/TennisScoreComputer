package org.adl.state;

import org.adl.TennisScoreComputer;

public class WinState extends AbstractState {

    private final char winner;

    public WinState(TennisScoreComputer context, char winner) {
        super(context);
        this.winner = winner;
    }

    @Override
    public AbstractState AMarksAPoint() {
        return new WinState(context,winner);
    }

    @Override
    public AbstractState BMarksAPoint() {
        return new WinState(context,winner);
    }

    @Override
    public String getScore() {
        return String.format("Player %c wins the game", winner);
    }
}
