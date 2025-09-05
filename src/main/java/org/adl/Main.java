package org.adl;

public class Main {
    public static void main(String[] args) {
        String match = "ABABAA";

        TennisScoreComputer tennisScoreComputer = new TennisScoreComputer();

        for (char player :  match.toCharArray()) {
            tennisScoreComputer.pointWonBy(player);
        }
    }
}
