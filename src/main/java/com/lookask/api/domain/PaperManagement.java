package com.lookask.api.domain;

import java.util.Date;

public class PaperManagement{
    
    private Long id;
    private String name;
    private String code;
    private String questions;
    private Long majorId;
    private String majorName;
    private Long gradeId;
    private String gradeName;
    private long score;
    private Date createTime;
    private boolean status;
    
    public PaperManagement(){}
    
    
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
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setQuestions(String questions) {
        this.questions = questions;
    }
    
    public String getQuestions() {
        return this.questions;
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
    
    public void setScore(long score) {
        this.score = score;
    }
    
    public long getScore() {
        return this.score;
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