package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/games")   // doing this means every root will ave this /games prefix
public class GameController {

    private Game game;
    private String currentWord;
    private ArrayList<String> guessedLetters;

    // returns a new game object
    @PostMapping
    public ResponseEntity<Reply> newGame() {
        // POST is used to create something on the server, with or without user input
        // Allows client to include some data within the boy of the request
        this.game = new Game("hello", 0, false);
        this.currentWord = "*****";
        this.guessedLetters = new ArrayList<>();
        Reply reply = new Reply(true, this.currentWord, "New game started");
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping  // telling it to make a HTTP GET request
    public ResponseEntity<Reply> getGameStatus() {
        // no parameters as GET does not allow clients to submit data as part of their request.
        // to include extra details in the request, would modify the URL.
        Reply reply = new Reply(true, this.currentWord, "Game in progress");
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Reply> handleGuess(){
        public ResponseEntity<Reply> handleGuess(@RequestBody Guess guess);
    }

    // create new Reply object
    Reply reply;

    // check if letter has already been guessed
    if (this.guessedLetters.contains(guess.getLetter())) {
        reply = new Reply(
                false,
                this.currentWord,
                String.format("Already guessed %s", guess.getLetter()
                ));
    }

    // add letter to previous guesses
    this.guessedLetters.add(guess.getLetter());

    // check for incorrect guess
    if (!game.getWord().contains(guess.getLetter())) {
        reply = new Reply(
                false,
                this.currentWord,
                String.format("%s is not in the word", guess.getLetter())
        );
    }

    // process correct guess
    String runningResult = game.getWord();

    for (Character letter : game.getWord().toCharArray()) {
        if (!this.guessedLetters.contains(letter.toString())) {
            runningResult = runningResult.replace(letter, '*');
        }
    }

    this.currentWord = runningResult;

    reply = new Reply(
        true,
                this.currentWord,
        String.format("%s is in the word", guess.getLetter())
            );

    // return result
    return new ResponseEntity<>(reply, HttpStatus.OK);




}
