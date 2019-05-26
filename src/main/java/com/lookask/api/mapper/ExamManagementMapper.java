package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.ExamManagement;

@Mapper
public interface ExamManagementMapper{
    void add(ExamManagement entity);
    
    void delete(Long id);
    
    void update(ExamManagement entity);
    
    ExamManagement findById(Long id);
}