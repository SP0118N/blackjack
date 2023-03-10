package com.game.blackjack.controller;

import com.game.blackjack.Dealer;

class BlackJackApp {
    private boolean gameOver;
    private Dealer dealer = new Dealer();

    public void execute() {
        welcome();
        promptForHelp();
        promptForPlayers();
        startGame();
    }

    private void startGame() {
        while (!gameOver) {
            // do the rounds of BlackJack by calling other method

            // gameOver = re-evaluated each time thru the loop
            // if(==21 || >21)
        }
    }

    private void promptForPlayers() {
    }

    private void promptForHelp() {
    }

    private void welcome() {
    }

}