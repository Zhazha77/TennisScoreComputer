package org.adl.state;

import org.adl.TennisScoreComputer;

public class AdvantageState extends GameState {

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
}
