package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.ApplicationQuestions;

@Mapper
public interface ApplicationQuestionsMapper{
    void add(ApplicationQuestions entity);
    
    void delete(Long id);
    
    void update(ApplicationQuestions entity);
    
    ApplicationQuestions findById(Long id);
}