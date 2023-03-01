package com.example.word_guesser.models;

public class Reply {

    private String wordState;
    private String message;
    private boolean correct;

    public Reply( boolean correct, String wordState, String message) {
        this.wordState = wordState;
        this.message = message;
        this.correct = correct;
    }


    public Reply(){}


    // GETTERS AND SETTERS
    public String getWordState() {
        return wordState;
    }

    public void setWordState(String wordState) {
        this.wordState = wordState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
