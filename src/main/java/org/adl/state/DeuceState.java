package org.adl.state;

import org.adl.TennisScoreComputer;

public class DeuceState extends AbstractState {

    public DeuceState(TennisScoreComputer context) {
        super(context);
    }

    @Override
    public AbstractState AMarksAPoint() {
        return new AdvantageState(context, 'A');
    }

    @Override
    public AbstractState BMarksAPoint() {
        return new AdvantageState(context, 'B');

    }
}
