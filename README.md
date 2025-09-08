# TennisScoreComputer

## About

This is a simple tennis game score computer. The game is represented by a sequence of 'A' and 'B', representing the player winning each point.
The score is printed after each point.

## State Design Pattern

During the design of the solution, I aimed to maximize the readability and the maintainability of the program.
A tennis game can be modeled into a system of four states :

![alt text](docs/state_diagram.svg?raw=true)

* **Regular state:**  The firsts points follow the incremental logic of tennis points (15 -> 30 -> 40).
* **Deuce state:** At 40 points and in case of equality, the game is in the **Deuce state**, which will become an **Advantage state** for the player that wins the point.
* **Advantage state:** The advantage is a pivot state where the advantaged player can either win the game by winning the point or return to **Deuce state**.
* **Win state:** This is the final state that will declares the winner.

