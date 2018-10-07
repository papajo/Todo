package com.example.gpa;
 
import java.util.HashMap;
 
public class Student {
    
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<Course, Double> courseGrades;
    
    public Student() {
        this.courseGrades = new HashMap<>();
    }
    
    public double getGPA() {
        double totalGrades = 0;
        double totalCredits = 0;
        
        for (Course course : this.courseGrades.keySet()) {
            totalGrades += this.courseGrades.get(course) * course.getCredit();
            totalCredits += course.getCredit();
        }
        
        return totalGrades / totalCredits;
    }
    
    public void addCourseGrade(Course course, Double grade) {
        this.courseGrades.put(course, grade);
    }
}