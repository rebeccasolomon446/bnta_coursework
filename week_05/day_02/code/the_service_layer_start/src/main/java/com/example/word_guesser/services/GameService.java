package com.example.word_guesser.services;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Guess;
import com.example.word_guesser.models.Reply;
import com.example.word_guesser.repositories.GameRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// keeping track os the game's state should not be the job of the controller
// CREATING A NEW GAME SHOULD NOT BE MADE IN THE CONTROLLER - REMOVE
// GAME CONTROLLER SHOULD NOT BE HANDLING THE GUESS OF THE CLIENT

@Service  // class into a bean
public class GameService {

    @Autowired // without this we would have to keep instantiating startNewGame()
    WordService wordService;

    @Autowired
    GameRepository gameRepository;
    private Game game;
    private String currentWord;
    private ArrayList<String> guessedLetters;

    public GameService(){
    }
    // never going to send back this method.
    // we only set up the properties below only when the user wants to begin a new game. This is why gameService() is empty

    public Reply startNewGame(){
        String targetWord = wordService.getRandomWord();
        Game game = new Game(targetWord);
        gameRepository.save(game);
        this.currentWord = Strings.repeat("*", targetWord.length());
        this.guessedLetters = new ArrayList<>();
        return new Reply(false, this.currentWord, "New game started");
    }

    public Reply processGuess(Guess guess, int id){
        Reply reply;

        Game game = gameRepository.findById(id).get();

        if(game.isComplete()) {       // stopping user from trying to guess another letter when the game is finished.
            reply = new Reply(
                    false,
                    game.getWord(),
                    String.format("Already finished %s", game.getId())
            );

            return reply;
        }

        // check if letter has already been guessed
        if (this.guessedLetters.contains(guess.getLetter())) {
            incrementGuesses(game);
            reply = new Reply(
                    false,
                    this.currentWord,
                    String.format("Already guessed %s", guess.getLetter()
                    ));
            return reply;
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
            return reply;
        }
        // process correct guess
        String runningResult = game.getWord();

        for (Character letter : game.getWord().toCharArray()) {
            if (!this.guessedLetters.contains(letter.toString())) {
                runningResult = runningResult.replace(letter, '*');
            }
        }

        this.currentWord = runningResult;

        // want to check if the game has been won or not
        if(checkWinCondition(game)) {
            game.setComplete(true);
            gameRepository.save(game);
            reply = new Reply(
                    true,
                    this.currentWord,
                    "You win!"
            );
        }

        reply = new Reply(
                true,
                this.currentWord,
                String.format("%s is in the word", guess.getLetter())
        );

        return reply;
    }




    // getters and setters


    public String getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    public ArrayList<String> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(ArrayList<String> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    // private method: when it only needs to be used by the class it is in

    private boolean checkWinCondition(Game game) {
        return game.getWord().equals(this.currentWord); // win once the * turns into a full word
    }

    private void incrementGuesses(Game game) {   // counting the amount of guesses the user makes
        game.setGuesses((game.getGuesses() + 1));
        gameRepository.save(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> getGameById(int id){
        return gameRepository.findById(id);
    }
}

// we have an arraylist of games. so the GameService keeps track of the count of games. But this is what database should be used for.
// GamesService handles the games AND the count of games, breaking the Single Responsibility principle