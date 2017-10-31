/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupwork;


import java.util.jar.Attributes;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

 


/**
 *
 * @author Bence
 */
public class QuestionWindowController extends Application {

    @FXML
    private RadioButton rbQ1Disagree;
    @FXML
    private RadioButton rbQ2Disagree;
    @FXML
    private RadioButton rbQ3Disagree;
    @FXML
    private RadioButton rbQ6Disagree;
    @FXML
    private RadioButton rbQ7Disagree;
    @FXML
    private RadioButton rbQ8Disagree;
    @FXML
    private RadioButton rbQ5Disagree;
    @FXML
    private RadioButton rbQ4Disagree;
    @FXML
    private RadioButton rbQ4Agree;
    @FXML
    private RadioButton rbQ5Neutral;
    @FXML
    private RadioButton rbQ1Neutral;
    @FXML
    private RadioButton rbQ2Neutral;
    @FXML
    private RadioButton rbQ3Neutral;
    @FXML
    private RadioButton rbQ4Neutral;
    @FXML
    private RadioButton rbQ6Neutral;
    @FXML
    private RadioButton rbQ7Neutral;
    @FXML
    private RadioButton rbQ8Neutral;
    @FXML
    private RadioButton rbQ1Agree;
    @FXML
    private RadioButton rbQ2Agree;
    @FXML
    private RadioButton rbQ5Agree;
    @FXML
    private RadioButton rbQ3Agree;
    @FXML
    private RadioButton rbQ6Agree;
    @FXML
    private RadioButton rbQ7Agree;
    @FXML
    private RadioButton rbQ8Agree;
    @FXML
    private ToggleGroup Q1;
    @FXML
    private ToggleGroup Q2;
    @FXML
    private ToggleGroup Q3;
    @FXML
    private ToggleGroup Q4;
    @FXML
    private ToggleGroup Q5;
    @FXML
    private ToggleGroup Q6;
    @FXML
    private ToggleGroup Q7;
    @FXML
    private ToggleGroup Q8;
    @FXML
    private Text QT1;
    @FXML
    private Text QT2;
    @FXML
    private Text QT3;
    @FXML
    private Text QT4;
    @FXML
    private Text QT5;
    @FXML
    private Text QT6;
    @FXML
    private Text QT7;
    @FXML
    private Text QT8;
    @FXML
    private Label LabelName;
    @FXML
    private GridPane gridMainGrid;
    @FXML
    private Button calButton;
    @FXML
    private Label txtScore;
            
    
    
    private MainWindowController controller;        
    
   
   
    
    
    @Override
    public void start(Stage primaryStage) 
    {
       
        
    }
    
    public void setName(String name)
    {
            LabelName.setText(name);

    }

    public void setController(MainWindowController controller)
    {
            this.controller = controller;
    }
    
    
   
    @FXML
    public void handleButtonAction(ActionEvent event)
    {
        int score = 0;
        
        //Q1
                if(rbQ1Disagree.isSelected()) score--;
                else if (rbQ1Agree.isSelected()) score++;
        //Q2
               if(rbQ2Disagree.isSelected()) score--;
               else if (rbQ2Agree.isSelected()) score ++;
        //Q3
               if(rbQ3Disagree.isSelected()) score--;
               else if (rbQ3Agree.isSelected()) score++;
        //Q4   
               if(rbQ4Disagree.isSelected()) score--;
               else if (rbQ4Agree.isSelected()) score++;
        //Q5      
               if(rbQ5Disagree.isSelected()) score--;
               else if (rbQ5Agree.isSelected()) score++;
        //Q6     
               if(rbQ6Disagree.isSelected()) score--;
               else if (rbQ6Agree.isSelected()) score++;
        //Q7    
               if(rbQ7Disagree.isSelected()) score--;
               else if (rbQ7Agree.isSelected()) score++;
        //Q8     
               if(rbQ8Disagree.isSelected()) score--;
               else if (rbQ8Agree.isSelected()) score++;
               
        //display the score
               txtScore.setText("" + score);
              
                
    }
}