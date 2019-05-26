package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.ApplicationQuestionsService;
import com.lookask.api.domain.ApplicationQuestions;

@RestController
@RequestMapping(value = "/applicationQuestions")
public class ApplicationQuestionsController{

    @Autowired
    private ApplicationQuestionsService applicationQuestionsService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addApplicationQuestions(final @RequestBody ApplicationQuestions applicationQuestions){
        applicationQuestionsService.add(applicationQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteApplicationQuestions(@PathVariable Long id){
        applicationQuestionsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateApplicationQuestions(final @RequestBody ApplicationQuestions applicationQuestions){
        applicationQuestionsService.update(applicationQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdApplicationQuestions(@PathVariable Long id){
        ApplicationQuestions applicationQuestions = applicationQuestionsService.findById(id);
        return new ResponseEntity<>(applicationQuestions, HttpStatus.OK);
    }
}
