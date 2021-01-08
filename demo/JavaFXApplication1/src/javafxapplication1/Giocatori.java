package javafxapplication1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


    

public class Giocatori implements Initializable {

    
     @FXML private Button btn1;
     @FXML private TextField txt;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    @FXML
    public void insert () throws Exception{
        
        
        Stage stage = JavaFXApplication1.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));     
        Scene scene = new Scene(root);
        stage.setTitle("Torneo");
        stage.setScene(scene);
        stage.show();
    
    }


}