package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.ChoiceQuestionsService;
import com.lookask.api.domain.ChoiceQuestions;

@RestController
@RequestMapping(value = "/choiceQuestions")
public class ChoiceQuestionsController{

    @Autowired
    private ChoiceQuestionsService choiceQuestionsService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addChoiceQuestions(final @RequestBody ChoiceQuestions choiceQuestions){
        choiceQuestionsService.add(choiceQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteChoiceQuestions(@PathVariable Long id){
        choiceQuestionsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateChoiceQuestions(final @RequestBody ChoiceQuestions choiceQuestions){
        choiceQuestionsService.update(choiceQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdChoiceQuestions(@PathVariable Long id){
        ChoiceQuestions choiceQuestions = choiceQuestionsService.findById(id);
        return new ResponseEntity<>(choiceQuestions, HttpStatus.OK);
    }
}
