import org.junit.Test;
import org.junit.Assert;
import com.udemy.ucp.*;
import com.example.gpa.*;
/* Student.java and Course.java */
public class Evaluate {
    
    EvaluationHelper helper = new EvaluationHelper();
    
    @Test
    public void testCourseCredit() {
        Course course = new Course();
        course.setCredit(4.0);
        Assert.assertEquals("Didn't set course credit?", 4.0, course.getCredit(), 0.0001);
    }
    
    
    @Test
    public void testCourseTitle() {
        Course course = new Course();
        course.setTitle("Introduction to Java Exercises");
        Assert.assertEquals("Didn't set the course title?", "Introduction to Java Exercises", 
                course.getTitle());
    }
    
    @Test
    public void testCourseId() {
        Course course = new Course();
        course.setId("JAVA101");
        Assert.assertEquals("Didn't set the course id?", "JAVA101", 
                course.getId());
    }
    
    @Test
    public void testGetGPAOneCourse() {
        Course course = new Course();
        course.setCredit(3.0);
        
        Student student = new Student();
        student.addCourseGrade(course, 3.5);
        
        Assert.assertEquals("With 1 course, it didn't work!", 3.5, 
                            student.getGPA(), 0.005);
    }
    
    @Test
    public void testStudentFieldDeclarations() {
        Student student = new Student();
        
        if(!helper.isFieldDeclared(student, "id")) {
            Assert.fail("'id' is not declared in Student class!");
        }
        if(!helper.isFieldDeclared(student, "firstName")) {
            Assert.fail("'firstName' is not declared in Student class!");
        }
        if(!helper.isFieldDeclared(student, "lastName")) {
            Assert.fail("'lastName' is not declared in Student class!");
        }
    }
    
    @Test
    public void testGetGPATwoCourses() {
        Course course1 = new Course();
        course1.setCredit(3.0);
        Course course2 = new Course();
        course2.setCredit(5.0);
        
        Student student = new Student();
        student.addCourseGrade(course1, 3.5);
        student.addCourseGrade(course2, 2.0);
        
        Assert.assertEquals("With 2 courses, it didn't work!", 2.56, 
                            student.getGPA(), 0.005);
    }
    
    @Test
    public void testGetGPAThreeCourses() {
        Course course1 = new Course();
        course1.setCredit(3.0);
        Course course2 = new Course();
        course2.setCredit(5.0);
        Course course3 = new Course();
        course3.setCredit(4.0);
        
        Student student = new Student();
        student.addCourseGrade(course1, 3.5);
        student.addCourseGrade(course2, 2.0);
        student.addCourseGrade(course3, 3.0);
        
        Assert.assertEquals("With 3 courses, it didn't work!", 2.71, 
                            student.getGPA(), 0.005);
    }
    
    @Test
    public void testPackageNames() {
        Assert.assertEquals("Package name must be com.example.gpa",
            "package com.example.gpa", Student.class.getPackage().toString());
        Assert.assertEquals("Package name must be com.example.gpa",
            "package com.example.gpa", Course.class.getPackage().toString());
    }
}