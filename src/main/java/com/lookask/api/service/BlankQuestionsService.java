package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.BlankQuestions;
import com.lookask.api.mapper.BlankQuestionsMapper;

@Service
public class BlankQuestionsService {

	@Autowired
	private BlankQuestionsMapper blankQuestionsMapper;
	
    public void add(BlankQuestions entity) {
    	blankQuestionsMapper.add(entity);
    }
    
    public void delete(Long id) {
    	blankQuestionsMapper.delete(id);
    }
    
    public void update(BlankQuestions entity) {
    	blankQuestionsMapper.update(entity);
    }
    
    public BlankQuestions findById(Long id) {
    	return blankQuestionsMapper.findById(id);
    }
}