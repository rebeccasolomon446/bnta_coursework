package com.example.word_guesser.repositories;

import com.example.word_guesser.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;


//connecting game to database
public interface GameRepository extends JpaRepository<Game, Integer> {    //mapping : converting java to SQL (allowed by Jpa)
}
