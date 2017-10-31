/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_inheritance.and.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fábio
 */
public class Student extends Person {
    
    private List<GradeInfo> gradeReport = new ArrayList<>();
    private String education;
    //private GradeInfo info;
    
    
    public Student(int id, String name, String education){
        super(id, name);
        this.education = education;
    }
    
    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }
    
    public List<GradeInfo> getGradeReport(){
        return gradeReport;
    }
    
    public void addGrade(GradeInfo grade){
        gradeReport.add(grade);
    }

    public int getGrade(String subject){
        
        for (GradeInfo gradeInfo : gradeReport) {
            if(gradeInfo.getSubject().equals(subject))
                return gradeInfo.getGrade();
        }
        return -1;
        
    }
    
    public double getAverageGrade(){
       
        
        
        int AVG_Grade = 0 ;
        
        if (gradeReport.size() > 0){
            
        for (GradeInfo gradeInfo : gradeReport) {
            AVG_Grade = AVG_Grade + gradeInfo.getGrade();
        }
        
        AVG_Grade = AVG_Grade / gradeReport.size();
        return AVG_Grade;
    }
       return -1; 
    }
            
    
    @Override
    public String toString() {
        return "ID\tNAME\t\tEMAIL\tEDUCATION\tAVG.GRADE\n" + id +"\t"+ name +"\t" + email +"\t"+ education +"\t\t"+ getAverageGrade() ;  
    }
    
    
}
