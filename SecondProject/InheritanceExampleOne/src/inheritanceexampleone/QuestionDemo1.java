/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexampleone;

import java.util.Scanner;

/**
 *
 * @author mr.Andersen
 */
public class QuestionDemo1 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        q.dislay();
        System.out.println("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
    
}
