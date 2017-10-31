/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_inheritance.and.polymorphism;

/**
 *
 * @author Fábio
 */
public class Person {
    
        protected String email;
	protected String name;
	protected final int id;
        
        
        
        
        public Person(int id, String name) {
		
		
		this.name = name;
                this.id = id;      
	}
        
        public int getId(){ 
            return id;
        }
        
        public String getName(){
            return name;
        }
        
        public String getEmail(){
            return email;
        }
        
        public void setName(String name){
            this.name = name;
        }        
        
        public void setEmail(String email){
            this.email = email;
        }

    @Override
    public String toString() {
        
         return  id  + "\t" + name + "\t" + email + "\n" ;
    }
        
        
        
       
    
}
