package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.BlankQuestionsService;
import com.lookask.api.domain.BlankQuestions;

@RestController
@RequestMapping(value = "/blankQuestions")
public class BlankQuestionsController{

    @Autowired
    private BlankQuestionsService blankQuestionsService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addBlankQuestions(final @RequestBody BlankQuestions blankQuestions){
        blankQuestionsService.add(blankQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBlankQuestions(@PathVariable Long id){
        blankQuestionsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateBlankQuestions(final @RequestBody BlankQuestions blankQuestions){
        blankQuestionsService.update(blankQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdBlankQuestions(@PathVariable Long id){
        BlankQuestions blankQuestions = blankQuestionsService.findById(id);
        return new ResponseEntity<>(blankQuestions, HttpStatus.OK);
    }
}
