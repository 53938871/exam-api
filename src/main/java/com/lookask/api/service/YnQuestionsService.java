package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.YnQuestions;
import com.lookask.api.mapper.YnQuestionsMapper;

@Service
public class YnQuestionsService {

	@Autowired
	private YnQuestionsMapper ynQuestionsMapper;
	
    public void add(YnQuestions entity) {
    	ynQuestionsMapper.add(entity);
    }
    
    public void delete(Long id) {
    	ynQuestionsMapper.delete(id);
    }
    
    public void update(YnQuestions entity) {
    	ynQuestionsMapper.update(entity);
    }
    
    public YnQuestions findById(Long id) {
    	return ynQuestionsMapper.findById(id);
    }
}