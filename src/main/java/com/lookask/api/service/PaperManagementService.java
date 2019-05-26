package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.PaperManagement;
import com.lookask.api.mapper.PaperManagementMapper;

@Service
public class PaperManagementService {

	@Autowired
	private PaperManagementMapper paperManagementMapper;
	
    public void add(PaperManagement entity) {
    	paperManagementMapper.add(entity);
    }
    
    public void delete(Long id) {
    	paperManagementMapper.delete(id);
    }
    
    public void update(PaperManagement entity) {
    	paperManagementMapper.update(entity);
    }
    
    public PaperManagement findById(Long id) {
    	return paperManagementMapper.findById(id);
    }
}