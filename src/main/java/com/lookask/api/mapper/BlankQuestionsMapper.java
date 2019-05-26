package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.BlankQuestions;

@Mapper
public interface BlankQuestionsMapper{
    void add(BlankQuestions entity);
    
    void delete(Long id);
    
    void update(BlankQuestions entity);
    
    BlankQuestions findById(Long id);
}