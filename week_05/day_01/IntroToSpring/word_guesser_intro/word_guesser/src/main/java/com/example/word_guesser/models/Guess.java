package com.example.word_guesser.models;

public class Guess {

    private String letter;

    public Guess(String letter) {
        this.letter = letter;
    }

    public Guess(){}

    // GETTERS AND SETTERS
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
