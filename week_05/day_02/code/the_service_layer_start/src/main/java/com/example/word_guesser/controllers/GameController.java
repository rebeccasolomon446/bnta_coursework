package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Guess;
import com.example.word_guesser.models.LetterList;
import com.example.word_guesser.models.Reply;
import com.example.word_guesser.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired  //
    GameService gameService;

    @PostMapping
    public ResponseEntity<Reply> newGame(){
        Reply reply = gameService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }


    @PatchMapping(value = "/{id}")                                                    // localhost:8080/games/:Id
    public ResponseEntity<Reply> handleGuess(@RequestBody Guess guess, @PathVariable int id) {
        Reply reply = gameService.processGuess(guess, id);
        // return result
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @GetMapping(value = "/guessed")
    public ResponseEntity<LetterList> checkGuesses(){
        LetterList letters = new LetterList(gameService.getGuessedLetters());
        return new ResponseEntity<>(letters, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Game>> getAllGames() {
        List<Game> games = gameService.getAllGames();
        return new ResponseEntity<List<Game>>(games, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable int id) {
        Optional<Game> game = gameService.getGameById(id);
        if (game.isPresent()) {
            return new ResponseEntity<>(game.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
