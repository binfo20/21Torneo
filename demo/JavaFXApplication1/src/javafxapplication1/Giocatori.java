
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

     @FXML private TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
     @FXML private TextField [] txts;
     private String nicks[] = new String[16];   

    @FXML
    public void insert () throws Exception{
        for (int i = 0; i<16 ;i++) {
            nicks[i] = txts[i].getText();
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.transfer(nicks);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txts = new TextField[]{t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16};
    } 

}