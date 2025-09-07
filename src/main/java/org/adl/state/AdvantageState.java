package org.adl.state;

import org.adl.TennisScoreComputer;

public class AdvantageState extends AbstractState {

    private char advantagedPlayer;

    public AdvantageState(TennisScoreComputer context, char advantagedPlayer) {

        super(context);
        this.advantagedPlayer = advantagedPlayer;
    }

    @Override
    public AbstractState AMarksAPoint() {
        if(advantagedPlayer == 'A') {
            return new WinState(context, 'A');
        }
        else {
            return new DeuceState(context);
        }
    }

    @Override
    public AbstractState BMarksAPoint() {
        if(advantagedPlayer == 'B') {
            return new WinState(context, 'B');
        }
        else {
            return new DeuceState(context);
        }
    }

    @Override
    public String getScore() {
        return String.format("Player %c has the advantage", context.getPlayerAPoints() > context.getPlayerBPoints() ? 'A' : 'B');
    }
}
