/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasper
 */
public class Main {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<Person> persons = new ArrayList<>();
         
         Student james = new Student(100, "James Rholand", "Computer Science");
         james.setEmail("jfh@easv.dk");
         GradeInfo gi1 = new GradeInfo("Math", 10);
         james.addGrade(gi1);
         GradeInfo gi2 = new GradeInfo("SDE", 5);
         james.addGrade(gi2);     
         
         Student billy = new Student(101, "Billy Boba", "Hilly Billy Studies");
         billy.setEmail("bob@easv.dk");
         GradeInfo g3 = new GradeInfo("Math", 4);
         billy.addGrade(g3);
         GradeInfo g4 = new GradeInfo("ITO", 10);
         billy.addGrade(g4);
         
         
        
        persons.add(james);
        persons.add(billy);
        for (Person person : persons) 
        {
            System.out.println(person);
        }
         

        
    }}
//         Person hans = new Student(100, "Hans Nielsen", "Computer Science");
//         hans.setEmail("hni@easv.dk");
//         GradeInfo gi = new GradeInfo(8.5, "math");
//         hans.addGrade(gi);
//         hans.setSubject("SDE ");
//         hans.getGrade("math");
         
//         Person niels = new Student (101, "Niels Hansen", "Computer science");
//         niels.setEmail("nha@easv.dk");
//         niels.setSubject("ITO ");
//         
//         Person ib = new Student (102, "Ib Boesen", "Computer science");
//         ib.setEmail("ibo@easv.dk");
//         ib.setSubject("SDE ");
//    
//         Person bo = new Student(105, "Bo Ibsen", "Computer science");
//         bo.setEmail("bib@easv.dk");
//         bo.setSubject("CS");
//         bo.setSubject("Programming ");
             
//         Person bent = new Teacher(202, "Bent H. Pedersen");
//         bent.setEmail("bhp@easv.dk");
//         bent.setInitial("bhp");
//         bent.setSubject("Programming ");
//         
//         
//         Person kent = new Teacher(203, "Kent H. Sørensen");
//         kent.setEmail("khs@easv.dk");
//         kent.setInitial("khs");
//         kent.setSubject("Horsing around ");
//         
//         
//         
//         printInfoStudent(bo);
//         printInfoStudent(ib);
//         printInfoStudent(niels);
//         printInfoStudent(hans);
//         
//         printInfoTeacher(kent);
//         printInfoTeacher(bent);
//    
        
        
         
    
    
    
    
//    public static void printInfoStudent(Person person)
//    {
//  
//        System.out.println("Your name is: " + person.getName());
//        System.out.println("Your student ID is: " + person.getId());
//        System.out.println("Your student Email is: " +person.getEmail());
////        System.out.println("Your Grade for "  + person.getSubject() + "Is " + person.getGrade("math"));
//
//        System.out.println("\n");
//        
//      
//   
    
    
   
    
//    public static void printInfoTeacher(Person person)
//    {
//        System.out.println("Your name is: " + person.getName());
//        System.out.println("Your Teacher ID is: " + person.getId());
//        System.out.println("Your Teacher Email is: " + person.getEmail());
//        System.out.println("Your Main study is: " + person.getSubject());
//        System.out.println("\n");
//    }
//    
    

