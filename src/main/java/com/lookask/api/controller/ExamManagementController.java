package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.ExamManagementService;
import com.lookask.api.domain.ExamManagement;

@RestController
@RequestMapping(value = "/examManagement")
public class ExamManagementController{

    @Autowired
    private ExamManagementService examManagementService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addExamManagement(final @RequestBody ExamManagement examManagement){
        examManagementService.add(examManagement);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteExamManagement(@PathVariable Long id){
        examManagementService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateExamManagement(final @RequestBody ExamManagement examManagement){
        examManagementService.update(examManagement);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdExamManagement(@PathVariable Long id){
        ExamManagement examManagement = examManagementService.findById(id);
        return new ResponseEntity<>(examManagement, HttpStatus.OK);
    }
}
