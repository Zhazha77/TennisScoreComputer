package org.adl.state;

import org.adl.TennisScoreComputer;

public class RegularState extends GameState {

    public RegularState(TennisScoreComputer context) {
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
