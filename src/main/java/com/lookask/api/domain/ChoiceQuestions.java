package com.lookask.api.domain;

import java.util.Date;

public class ChoiceQuestions{
    
    private Long id;
    private boolean type;
    private String question;
    private String answer;
    private boolean level;
    private Long majorId;
    private String majorName;
    private Long gradeId;
    private String gradeName;
    private String solution;
    private Date createTime;
    private boolean status;
    
    public ChoiceQuestions(){}
    
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setType(boolean type) {
        this.type = type;
    }
    
    public boolean getType() {
        return this.type;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getQuestion() {
        return this.question;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setLevel(boolean level) {
        this.level = level;
    }
    
    public boolean getLevel() {
        return this.level;
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
    
    public void setSolution(String solution) {
        this.solution = solution;
    }
    
    public String getSolution() {
        return this.solution;
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