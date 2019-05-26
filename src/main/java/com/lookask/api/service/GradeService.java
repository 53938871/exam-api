package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.Grade;
import com.lookask.api.mapper.GradeMapper;

@Service
public class GradeService {

	@Autowired
	private GradeMapper gradeMapper;
	
    public void add(Grade entity) {
    	gradeMapper.add(entity);
    }
    
    public void delete(Long id) {
    	gradeMapper.delete(id);
    }
    
    public void update(Grade entity) {
    	gradeMapper.update(entity);
    }
    
    public Grade findById(Long id) {
    	return gradeMapper.findById(id);
    }
}