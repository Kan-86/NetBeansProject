/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author mr.Andersen
 */
public class NumberConversionModel 
{
    
    
    /*private String  GreetingsMessage;
    public String getGreetingsMessage(String name)
    {
        System.out.println("Hello, " + name + ". Greetings from the top Java developer class in town");
        return GreetingsMessage;
    }*/
    
    public double getMilesFromKilometers(double km)
    {
        double miles = (1.609344 * km)*100;
        return miles = Math.round(miles)/100.d;
    }
    public double getKilometersFromMiles(double miles)
    {
        double km = (miles / 1.609344 )*100;
        return km = Math.round(km)/100d;
    }

}
