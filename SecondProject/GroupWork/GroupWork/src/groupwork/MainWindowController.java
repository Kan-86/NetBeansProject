/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupwork;

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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author mr.Andersen
 */
public class MainWindowController implements Initializable 
{
    
    
    @FXML
    static Button button;
    
    @FXML
    private TextField txtNameField;
    
    
            
           
    public void start(Stage stage) throws Exception 
    {
     }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException
    {
         
            // Fetches primary stage and gets loader and loads FXML file to Parent
	Stage primStage = (Stage)txtNameField.getScene().getWindow();// <-- itt betöltjük a jelenlegi staget, ez a jelenlegi ablakunk lesz
	FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionWindow.fxml")); //<- itt deklaráljuk az fxmlt egy változóba, hogy később hozzáférjünk más methodokhoz, ezt majd személyesen elmagyarázom mert hosszú
	Parent root = loader.load();// <- végül betöltjük az fxmlt
	
	// Fetches controller from view
	QuestionWindowController controller = loader.getController(); // <- itt férünk hozzá a másik controllerhez az fxml által amit 3 sorral fentebb deklarltunk a loader változóba
        controller.setController(this); //<- a controller setController methodját hívjuk meg és adjuk meg neki ezt a controllert mint külső controller.
	
	
	// Sets new stage as modal window
	Stage stageView = new Stage(); //<- új staget csinál az új ablaknak
	stageView.setScene(new Scene(root));// <- scenet seteli az új stagenek
	
	stageView.initModality(Modality.WINDOW_MODAL); //<- ablak mód, itt tudsz váltogatni hogy milyen tipusut akarsz
	stageView.initOwner(primStage); //<- hogy vissza tudj térni az előző ablakhoz
	
	
       controller.setName(txtNameField.getText()); // másik controller setName methodja, itt adjuk át neki a nevet a txtfieldből
	

	stageView.show(); //megjeleníti az új ablakot
                      
    }
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
