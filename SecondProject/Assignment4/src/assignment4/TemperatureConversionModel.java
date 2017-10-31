package assignment4;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mr.Andersen
 */
public class TemperatureConversionModel 
{
    public int getTemperatureInFahrenheit(int F)
    {
        int C = (F  * 9)/5 + 32;
        return C;
    }
    public  int getTemperatureInCelcius(int C)
    {
        int F = (C - 32)* 5/9;
        return F;
        
    }
}
