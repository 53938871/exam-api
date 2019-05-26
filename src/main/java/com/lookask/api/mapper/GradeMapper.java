package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.Grade;

@Mapper
public interface GradeMapper{
    void add(Grade entity);
    
    void delete(Long id);
    
    void update(Grade entity);
    
    Grade findById(Long id);
}