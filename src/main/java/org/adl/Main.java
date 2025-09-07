package org.adl;

public class Main {
    public static void main(String[] args) {
        String match = "ABABAA";

        TennisScoreComputer tennisScoreComputer = new TennisScoreComputer();
        tennisScoreComputer.computeScore(match);
    }
}
