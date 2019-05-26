package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.PaperManagementService;
import com.lookask.api.domain.PaperManagement;

@RestController
@RequestMapping(value = "/paperManagement")
public class PaperManagementController{

    @Autowired
    private PaperManagementService paperManagementService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addPaperManagement(final @RequestBody PaperManagement paperManagement){
        paperManagementService.add(paperManagement);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePaperManagement(@PathVariable Long id){
        paperManagementService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updatePaperManagement(final @RequestBody PaperManagement paperManagement){
        paperManagementService.update(paperManagement);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdPaperManagement(@PathVariable Long id){
        PaperManagement paperManagement = paperManagementService.findById(id);
        return new ResponseEntity<>(paperManagement, HttpStatus.OK);
    }
}
