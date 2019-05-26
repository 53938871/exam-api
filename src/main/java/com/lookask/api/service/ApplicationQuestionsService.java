package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.ApplicationQuestions;
import com.lookask.api.mapper.ApplicationQuestionsMapper;

@Service
public class ApplicationQuestionsService {

	@Autowired
	private ApplicationQuestionsMapper applicationQuestionsMapper;
	
    public void add(ApplicationQuestions entity) {
    	applicationQuestionsMapper.add(entity);
    }
    
    public void delete(Long id) {
    	applicationQuestionsMapper.delete(id);
    }
    
    public void update(ApplicationQuestions entity) {
    	applicationQuestionsMapper.update(entity);
    }
    
    public ApplicationQuestions findById(Long id) {
    	return applicationQuestionsMapper.findById(id);
    }
}