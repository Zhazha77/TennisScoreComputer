package org.adl.state;

import org.adl.TennisScoreComputer;

public class RegularState extends AbstractState {

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
