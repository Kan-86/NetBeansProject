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
public class Teacher extends Person {
    
    private String initials;
    private double salary;
    
    private List<String> subjects = new ArrayList<>();

    public Teacher(int id, String name, String initials) {
        super(id, name);
        this.initials = initials;
    }
    
    public List<String> getSubjects()
    {
        return subjects;
    }
    
    public String getInitials()
    {
        return initials;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public String toString() 
    {
        
        String tempSubject = "";
              
        if (subjects.size() > 0)
        tempSubject = subjects.get(0);
        
        return   "ID\tNAME\t\tEMAIL\tINITIALS\tMAIN\n" + id + "\t" + name + 
               "\t" + email + "\t" + initials + "\t\t" + tempSubject;
                
    }
    
}

