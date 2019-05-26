package com.lookask.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.lookask.api.service.MajorService;
import com.lookask.api.domain.Major;

@RestController
@RequestMapping(value = "/major")
public class MajorController{

    @Autowired
    private MajorService majorService;
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addMajor(final @RequestBody Major major){
        majorService.add(major);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteMajor(@PathVariable Long id){
        majorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateMajor(final @RequestBody Major major){
        majorService.update(major);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findByIdMajor(@PathVariable Long id){
        Major major = majorService.findById(id);
        return new ResponseEntity<>(major, HttpStatus.OK);
    }
}
