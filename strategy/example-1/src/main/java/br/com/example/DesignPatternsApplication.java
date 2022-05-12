package br.com.example;

import br.com.example.controller.ScoreBoard;
import br.com.example.model.Balloon;
import br.com.example.model.Clown;
import br.com.example.model.SquareBalloon;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon tap score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown tap score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon tap score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
