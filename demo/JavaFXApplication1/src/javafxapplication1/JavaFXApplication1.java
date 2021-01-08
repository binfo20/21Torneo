
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;  

public class JavaFXApplication1 extends Application implements EventHandler<ActionEvent> {
    public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("FP.fxml"));     
        Scene scene = new Scene(root);
        stage.setTitle("Torneo");
        stage.setScene(scene);
        stage.show();
    }
    public static Stage getStage(){
    
        return stage;
        
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
      
    }
    
}
