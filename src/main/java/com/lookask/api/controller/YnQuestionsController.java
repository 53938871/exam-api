package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.YnQuestionsService;
import com.lookask.api.domain.YnQuestions;

@RestController
@RequestMapping(value = "/ynQuestions")
public class YnQuestionsController{

    @Autowired
    private YnQuestionsService ynQuestionsService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addYnQuestions(final @RequestBody YnQuestions ynQuestions){
        ynQuestionsService.add(ynQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteYnQuestions(@PathVariable Long id){
        ynQuestionsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateYnQuestions(final @RequestBody YnQuestions ynQuestions){
        ynQuestionsService.update(ynQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdYnQuestions(@PathVariable Long id){
        YnQuestions ynQuestions = ynQuestionsService.findById(id);
        return new ResponseEntity<>(ynQuestions, HttpStatus.OK);
    }
}
