package org.adl.state;

import org.adl.TennisScoreComputer;

public class DeuceState extends GameState {

    public DeuceState(TennisScoreComputer context) {
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
