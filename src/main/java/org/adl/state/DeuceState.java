package org.adl.state;

import org.adl.TennisScoreComputer;

/**
 * Class representing the deuce state of a tennis game.
 */
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
