package org.adl.state;

import org.adl.TennisScoreComputer;

public class AdvantageState extends AbstractState {

    public AdvantageState(TennisScoreComputer context) {
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
        return String.format("Player %s has the advantage", context.getPlayerAPoints() > context.getPlayerBPoints() ? "A" : "B");
    }
}
