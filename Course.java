package com.example.gpa;
 
public class Course {
    
    private String id;
    private String title;
    private double credit;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public double getCredit() {
        return this.credit;
    }
    
    public void setCredit(double credit) {
        this.credit = credit;
    }
}