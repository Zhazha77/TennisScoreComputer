package org.adl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisScoreComputerTest {

    // Basic cases

    @Test
    void scoreIs0To0() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        assertEquals("Player A : 0 / Player B : 0", scoreComputer.getScore());
    }

    @Test
    void scoreIs15To0() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.pointWonBy('A');
        assertEquals("Player A : 15 / Player B : 0", scoreComputer.getScore());
    }

    @Test
    void scoreIs0To15() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.pointWonBy('B');
        assertEquals("Player A : 0 / Player B : 15", scoreComputer.getScore());
    }

    @Test
    void scoreIs15To15() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("AB");
        assertEquals("Player A : 15 / Player B : 15", scoreComputer.getScore());
    }

    @Test
    void scoreIs30To15() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("AAB");
        assertEquals("Player A : 30 / Player B : 15", scoreComputer.getScore());
    }

    @Test
    void scoreIs40To30() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("AAABB");
        assertEquals("Player A : 40 / Player B : 30", scoreComputer.getScore());
    }

    // Deuce cases

    @Test
    void scoreIsDeuceA() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABBA");
        assertEquals("Player A : 40 / Player B : 40", scoreComputer.getScore());
    }

    @Test
    void scoreIsDeuceB() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABAB");
        assertEquals("Player A : 40 / Player B : 40", scoreComputer.getScore());
    }

    // Advantage cases

    @Test
    void scoreIsAdvantageForA() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABA");
        assertEquals("Player A has the advantage", scoreComputer.getScore());
    }

    @Test
    void scoreIsAdvantageForB() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABB");
        assertEquals("Player B has the advantage", scoreComputer.getScore());
    }

    @Test
    void scoreIsAdvantageLostForA() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABAB");
        assertEquals("Player A : 40 / Player B : 40", scoreComputer.getScore());
    }

    @Test
    void scoreIsAdvantageLostForB() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABBA");
        assertEquals("Player A : 40 / Player B : 40", scoreComputer.getScore());
    }

    // Win cases

    @Test
    void scoreIsWinAfterAdvantageForA() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABAA");
        assertEquals("Player A wins the game", scoreComputer.getScore());
    }

    @Test
    void scoreIsWinAfterAdvantageForB() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("ABABABBB");
        assertEquals("Player B wins the game", scoreComputer.getScore());
    }

    @Test
    void scoreIsWinStreakForA() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("AAAA");
        assertEquals("Player A wins the game", scoreComputer.getScore());
    }

    @Test
    void scoreIsWinStreakForB() {
        TennisScoreComputer scoreComputer = new TennisScoreComputer();
        scoreComputer.computeScore("BBBB");
        assertEquals("Player B wins the game", scoreComputer.getScore());
    }




}