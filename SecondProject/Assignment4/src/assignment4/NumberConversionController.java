/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author mr.Andersen
 */
public class NumberConversionController implements Initializable 
{
    
    @FXML
    private Label label;
    @FXML
    private TextField txtNumberInput;
    @FXML
    private Label lblResult;
    


    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getMilesFromKilometers(txtFieldValue);
        String resultAsString = String.valueOf (resultInMiles);
        lblResult.setText(resultAsString);
        
    }
    @FXML
    private void handleButtonActionSecond(ActionEvent event) 
    {
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInKm = ncmodel.getKilometersFromMiles(txtFieldValue);
        String resultAsString = String.valueOf(resultInKm);
        lblResult.setText(resultAsString);
    }
    
    private NumberConversionModel ncmodel = new NumberConversionModel(); 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {       
            // first e
        
            /*TextInputDialog dialog = new TextInputDialog(""); 
            dialog.setTitle("Text Input Dialog");
            dialog.setContentText("Please enter your name:");  
            Optional<String> result = dialog.showAndWait();
                if (result.isPresent())
                {
                    String message = ncmodel.getGreetingsMessage(result.get());
                    label.setText(message);
                }*/
    }   
  
      
}
