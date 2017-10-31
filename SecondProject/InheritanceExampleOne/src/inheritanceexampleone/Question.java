/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexampleone;

/**
 *
 * @author mr.Andersen
 */
public class Question 
{
    private String text;
    private String answer;
    
    public Question()
    {
        text = "";
        answer = "";
    }
    
    public void setText(String questionText)
    {
        text = questionText;
    }
    
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }
    
    public void dislay()
    {
        System.out.println(text);
    }
}
