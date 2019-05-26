package com.lookask.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.lookask.api.domain.PaperManagement;

@Mapper
public interface PaperManagementMapper{
    void add(PaperManagement entity);
    
    void delete(Long id);
    
    void update(PaperManagement entity);
    
    PaperManagement findById(Long id);
}