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
public class Assignment5_InheritanceAndPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Person> persons = new ArrayList<>();
        
        Student james = new Student(100, "james Bond" , "CS");
        GradeInfo math = new GradeInfo("Maths" , 12);
        GradeInfo cs = new GradeInfo("CS" , 8);
        GradeInfo english = new GradeInfo("English" , -3);
        
        james.addGrade(math);
        james.addGrade(cs);
        james.addGrade(english);
        
               
        
        persons.add(james);
               
        
        for (Person person : persons) {
            System.out.println(person);
        }
            
        
    }
    
    

}
