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
public class QuestionWindowController extends MainWindowController 
{
    
    
    @FXML
    private Button calculateScoreButton;
    @FXML
    private Label scoreCounter; 
    @FXML
    public Label participantName; 
    
    
    @Override
    public void start(Stage primaryStage) 
    {
        //participantName.setText(mWController.name);
    }
    
    @FXML
    private void handleButtononAction(ActionEvent event) throws IOException
    {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
}
