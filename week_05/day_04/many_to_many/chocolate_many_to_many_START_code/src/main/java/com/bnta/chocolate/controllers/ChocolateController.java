package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("chocolates")
public class ChocolateController {

    @Autowired
    ChocolateRepository chocolateRepository;

//    Handles following:
//    * GET /chocolates
//    * GET /chocolates?cocoaPercentage=69

    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolatesAndFilters(
            @RequestParam(required = false, name = "cocoaPercentage") Integer cocoaPercentage
    ){
//        GET /chocolates?cocoaPercentage=69
        if(cocoaPercentage != null){
            return new ResponseEntity<>(chocolateRepository.findByCocoaPercentageGreaterThan(cocoaPercentage), HttpStatus.OK);
        }
//        GET /chocolates
        return new ResponseEntity<>(chocolateRepository.findAll(), HttpStatus.OK);
    }
    // SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Chocolate>> getChocolate(@PathVariable Long id){
        return new ResponseEntity(chocolateRepository.findById(id), HttpStatus.OK);
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Chocolate> postChocolate(@RequestBody Chocolate chocolate){
        chocolateRepository.save(chocolate);
        return new ResponseEntity<>(chocolate, HttpStatus.CREATED);
    }

    // UPDATE
    @PutMapping(value = "/{id}")
    public ResponseEntity<Chocolate> updateChocolate(@RequestBody Chocolate chocolate, @PathVariable Long id) {
        Chocolate chocolateToUpdate = chocolateRepository.findById(id).get();
        chocolateToUpdate.setName(chocolateToUpdate.getName());
        chocolateToUpdate.setCocoaPercentage(chocolate.getCocoaPercentage());
        chocolateToUpdate.setEstates(chocolate.getEstates());
        chocolateRepository.save(chocolateToUpdate);
        return new ResponseEntity<>(chocolateToUpdate, HttpStatus.OK);
    }



    // DELETE - taken to a page where you can view your single choc, with buttons to edit and delete
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteChocolate(@PathVariable Long id) {
        chocolateRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }




}
