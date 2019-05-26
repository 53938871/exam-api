package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.GradeService;
import com.lookask.api.domain.Grade;

@RestController
@RequestMapping(value = "/grade")
public class GradeController{

    @Autowired
    private GradeService gradeService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addGrade(final @RequestBody Grade grade){
        gradeService.add(grade);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteGrade(@PathVariable Long id){
        gradeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateGrade(final @RequestBody Grade grade){
        gradeService.update(grade);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdGrade(@PathVariable Long id){
        Grade grade = gradeService.findById(id);
        return new ResponseEntity<>(grade, HttpStatus.OK);
    }
}
