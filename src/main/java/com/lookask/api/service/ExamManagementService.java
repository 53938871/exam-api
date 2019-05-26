package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.ExamManagement;
import com.lookask.api.mapper.ExamManagementMapper;

@Service
public class ExamManagementService {

	@Autowired
	private ExamManagementMapper examManagementMapper;
	
    public void add(ExamManagement entity) {
    	examManagementMapper.add(entity);
    }
    
    public void delete(Long id) {
    	examManagementMapper.delete(id);
    }
    
    public void update(ExamManagement entity) {
    	examManagementMapper.update(entity);
    }
    
    public ExamManagement findById(Long id) {
    	return examManagementMapper.findById(id);
    }
}