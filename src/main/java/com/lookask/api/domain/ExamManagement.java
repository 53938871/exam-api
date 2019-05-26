package com.lookask.api.domain;

import java.util.Date;

public class ExamManagement{
    
    private Long id;
    private String name;
    private Date startTime;
    private Date endTime;
    private long duration;
    private Long majorId;
    private String majorName;
    private Long gradeId;
    private String gradeName;
    private String location;
    private Date createTime;
    private boolean status;
    
    public ExamManagement(){}
    
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setStarttime(Date startTime) {
        this.startTime = startTime;
    }
    
    public Date getStarttime() {
        return this.startTime;
    }
    
    public void setEndtime(Date endTime) {
        this.endTime = endTime;
    }
    
    public Date getEndtime() {
        return this.endTime;
    }
    
    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    public long getDuration() {
        return this.duration;
    }
    
    public void setMajorid(Long majorId) {
        this.majorId = majorId;
    }
    
    public Long getMajorid() {
        return this.majorId;
    }
    
    public void setMajorname(String majorName) {
        this.majorName = majorName;
    }
    
    public String getMajorname() {
        return this.majorName;
    }
    
    public void setGradeid(Long gradeId) {
        this.gradeId = gradeId;
    }
    
    public Long getGradeid() {
        return this.gradeId;
    }
    
    public void setGradename(String gradeName) {
        this.gradeName = gradeName;
    }
    
    public String getGradename() {
        return this.gradeName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setCreatetime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreatetime() {
        return this.createTime;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
}