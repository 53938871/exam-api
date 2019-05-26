package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.Major;
import com.lookask.api.mapper.MajorMapper;

@Service
public class MajorService {

	@Autowired
	private MajorMapper majorMapper;
	
    public void add(Major entity) {
    	majorMapper.add(entity);
    }
    
    public void delete(Long id) {
    	majorMapper.delete(id);
    }
    
    public void update(Major entity) {
    	majorMapper.update(entity);
    }
    
    public Major findById(Long id) {
    	return majorMapper.findById(id);
    }
}