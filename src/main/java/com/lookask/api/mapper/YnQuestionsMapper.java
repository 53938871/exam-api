package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.YnQuestions;

@Mapper
public interface YnQuestionsMapper{
    void add(YnQuestions entity);
    
    void delete(Long id);
    
    void update(YnQuestions entity);
    
    YnQuestions findById(Long id);
}