package org.adl.state;

import org.adl.TennisScoreComputer;

/**
 * Class representing the regular state of a tennis game, before reaching deuce or win state.
 */
public class RegularState extends AbstractState {

    public RegularState(TennisScoreComputer context) {
        super(context);
    }

    @Override
    public AbstractState AMarksAPoint() {
        if(context.getPlayerBPoints() == 3 && context.getPlayerAPoints() == 3){
            return new DeuceState(context);
        }
        else if(context.getPlayerAPoints() > 3){
            return new WinState(context, 'A');
        }
        return new RegularState(context);
    }

    @Override
    public AbstractState BMarksAPoint() {
        if(context.getPlayerBPoints() == 3 && context.getPlayerAPoints() == 3){
            return new DeuceState(context);
        }
        else if(context.getPlayerBPoints() > 3){
            return new WinState(context, 'B');
        }
        return new RegularState(context);
    }
}
