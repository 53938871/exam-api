package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lookask.api.domain.Major;

@Mapper
public interface MajorMapper{
    void add(Major entity);
    
    void delete(Long id);
    
    void update(Major entity);
    
    Major findById(Long id);
}