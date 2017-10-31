/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author mr.Andersen
 */
public class BMICalculationController {

    @FXML
    private TextField txtBMIInput;
    @FXML
    private Label lblResult;
    @FXML
    private Button calculateBMI;
    @FXML
    private TextField txtBMIInput1;
    
    @FXML
    private void handleButtonActionSecond(ActionEvent event) 
    {
        
        double heightInCm = Double.parseDouble(txtBMIInput.getText());
        double weightInKg = Double.parseDouble(txtBMIInput1.getText());
        double heightInM = (heightInCm / 100);
        double bmi = weightInKg / (Math.pow(heightInM, 2));
        
        
        /*double txtFieldValue = Double.parseDouble(txtBMIInput.getText());
        double txtFieldValue1 = Double.parseDouble(txtBMIInput1.getText());
        double weight = txtFieldValue;
        double heightinCM = 0;
        double heightinM = heightinCM / 100;
        double heightValue =  Math.pow(heightinM, 2);
        double weightValue = weight / heightValue;
        double BMIValue = weightValue;*/
        
        
        String resultText = String.valueOf(bmi);
        lblResult.setText(resultText);
        
        //System.out.println(bmi);
    }
    
    
}
