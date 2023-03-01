package com.example.word_guesser.models;

import javax.persistence.*;

@Entity(name = "games") //when app starts u, this well tell jpa this is something you can interact with
public class Game {

//                         private static int nextId = 1; // all classes will have access to this variable. Tracks what id the next game should have. ( counter)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // like a serial data type, rather that it being int.
    private int id;      // the actual game id unique to each game

    @Column(name = "word")
    private String word;

    @Column(name = "guesses")
    private int guesses;

    @Column(name = "complete")
    private boolean complete;

    public Game(String word) {
        this.word = word;
        this.guesses = 0;
        this.complete = false;
    }

    public Game() {
    }

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

    public int getId() {
        return this.id;
    }
}
