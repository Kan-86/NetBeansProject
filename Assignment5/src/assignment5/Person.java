/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.List;



/**
 *
 * @author kasper
 */

class Person extends Main{
    
    public String email;
    public int id;
    public String name;
    private double grade;
    public String Subject;        

    public Person(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
        
    
    
    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
}
