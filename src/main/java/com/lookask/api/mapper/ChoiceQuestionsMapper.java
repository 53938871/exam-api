package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.ChoiceQuestions;

@Mapper
public interface ChoiceQuestionsMapper{
    void add(ChoiceQuestions entity);
    
    void delete(Long id);
    
    void update(ChoiceQuestions entity);
    
    ChoiceQuestions findById(Long id);
}