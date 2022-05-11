package br.com.example.controller;

import br.com.example.model.ScoreAlgorithmBase;

public class ScoreBoard {

    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algorithmBase.calculateScore(taps, multiplier));
    }
}
