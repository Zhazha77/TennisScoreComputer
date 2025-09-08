package org.adl.state;

import org.adl.TennisScoreComputer;

/**
 * Abstract class for representing a tennis game state.
 */
public abstract class AbstractState {
    protected TennisScoreComputer context;

    public AbstractState(TennisScoreComputer context) {
        this.context = context;
    }

    /**
     * Trigger event of A marking a point.
     * @return the state in which the game is after the point is marked
     */
    public abstract AbstractState AMarksAPoint();

    /**
     * Trigger event of B marking a point.
     * @return the state in which the game is after the point is marked
     */
    public abstract AbstractState BMarksAPoint();

    /**
     * Give String representation of the tennis game score
     * @return String representation of the tennis game score
     */
    public String getScore() {
        return String.format("Player A : %s / Player B : %s", formatScore(context.getPlayerAPoints()), formatScore(context.getPlayerBPoints()));
    }

    /**
     * Convert marked points count of player into tennis game points.
     * @param score count of marked points by the player
     * @return deduced tennis game score
     */
    private String formatScore(int score) {
        return switch (score) {
            case 0 -> "0";
            case 1 -> "15";
            case 2 -> "30";
            default -> "40";
        };
    }
}
