package com.example.word_guesser.models;

public class Game {

    // need a word that has to be guessed
    // need to be able to check each letter guessed against the word
    // need a boolean if game is completed or not

    private String word;
    private int guesses;
    private boolean complete;

    public Game(String word, int guesses, boolean complete) {
        this.word = word;
        this.guesses = guesses;
        this.complete = complete;
    }

    // empty constructor that is needed for a POJO class
    // overloaded constructor, same constructor name, but no parameters

    public Game(){}

    // GETTERS AND SETTERS

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

}
