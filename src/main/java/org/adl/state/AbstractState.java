package org.adl.state;

import org.adl.TennisScoreComputer;

public abstract class AbstractState {
    protected TennisScoreComputer context;

    public AbstractState(TennisScoreComputer context) {
        this.context = context;
    }

    public abstract String AMarksAPoint();
    public abstract String BMarksAPoint();

    public String getScore() {
        return String.format("Player A : %s / Player B : %s", formatScore(context.getPlayerAPoints()), formatScore(context.getPlayerBPoints()));
    }

    private String formatScore(int score) {
        return switch (score) {
            case 0 -> "0";
            case 1 -> "15";
            case 2 -> "30";
            default -> "40";
        };
    }
}
