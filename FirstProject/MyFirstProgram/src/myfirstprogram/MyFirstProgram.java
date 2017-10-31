/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstprogram;

import static java.lang.Double.sum;

/**
 *
 * @author mr.Andersen
 */
public class MyFirstProgram 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String myString = "I walked down the cosy road and found a small snail. Picked him up and won a lottery";
        System.out.println("Original: ");
        System.out.println(myString);
        
        System.out.println(myString.replaceAll("snail", "elephant"));
        
        System.out.println(myString.indexOf("snail"));
        
        int x = 3;
        int y = 7;
        
        System.out.println("Result:" +addNumbers(x,y));
        System.out.println("Result:" +addMultipliers(x,y));
        System.out.println("Result:" +addPowerOf(x,y));
    }
    
    private static int addNumbers(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    
    private static int addMultipliers(int a, int b)
    {
        int sum = a*b;
        return sum;
    }
    
    private static int addPowerOf(int a, int b)
    {
        int sum = 1;
        for(int i = 0; i<b; i++)
        {
            sum = sum*a;
        }
        return sum;
    }
    
}
