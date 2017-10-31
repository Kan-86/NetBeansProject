/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import com.sun.glass.ui.Screen;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author mr.Andersen
 */
public class MainWindowController implements Initializable 
{
    
    
    @FXML
    private Button questionaireButton;
    @FXML
    private TextField nameField;  
    public String name; 
    public Label participantName; 
    
    public void start(Stage stage) throws Exception 
    {
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException
    {
        /* Opens up the QuestionWindow */
        if (nameField != null)
        {
            name = nameField.getText();
            
        }
        Parent root = FXMLLoader.load(getClass().getResource("QuestionWindow.fxml"));
        Scene scene = new Scene(root);           
        Stage stage = new Stage(); //Create new stage
        stage.setScene(scene);
        stage.showAndWait();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {

    }    
    
}
