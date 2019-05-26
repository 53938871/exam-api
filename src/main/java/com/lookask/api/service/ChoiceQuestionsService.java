package com.lookask.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lookask.api.domain.ChoiceQuestions;
import com.lookask.api.mapper.ChoiceQuestionsMapper;

@Service
public class ChoiceQuestionsService {

	@Autowired
	private ChoiceQuestionsMapper choiceQuestionsMapper;
	
    public void add(ChoiceQuestions entity) {
    	choiceQuestionsMapper.add(entity);
    }
    
    public void delete(Long id) {
    	choiceQuestionsMapper.delete(id);
    }
    
    public void update(ChoiceQuestions entity) {
    	choiceQuestionsMapper.update(entity);
    }
    
    public ChoiceQuestions findById(Long id) {
    	return choiceQuestionsMapper.findById(id);
    }
}