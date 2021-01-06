
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
    
    @FXML private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
        btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18,    
        btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28,
        btn29, btn30, btn31;
    @FXML private Label label;
    @FXML private Button[] buttons;
    @FXML private TextField punteggio;
    
    boolean button_control = true;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(button_control){
            Button btn_source = (Button)event.getSource();
            String btn_id = btn_source.getId().replace("btn", "");
            int b = Integer.parseInt(btn_id);
            int n, i = b;
            if(b%2==0){ //pari 
                for(n = 15; i>2; n--) i-=2; 
            } 
            else{ //dispari
                for(n = 16; i>1; n--) i-=2; 
            }
            buttons[(b+n)-1].setText(btn_source.getText());
            label.setText("Con quale punteggio ha vinto " + btn_source.getText() +"?");
            button_control = false;
        }
    }
    
    @FXML
    private void invioButton(ActionEvent event){
        if(!button_control){
            String text = punteggio.getText();
            double number;
            try{
                number = Double.valueOf(punteggio.getText());
                label.setText("Ok, ha vinto con " + String.valueOf(number) + " punti!");
                button_control = true;
                punteggio.setText(null);
                if(!buttons[30].getText().equals("")){
                    label.setText("Il torneo è stato vinto da: " + buttons[30].getText() + " con " + String.valueOf(number) + " punti!");
                }
            } 
            catch(Exception e){
                label.setText("HEY! INSERISCI UN NUMERO VERO!");
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        buttons = new Button[]{
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, 
            btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, 
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, 
            btn30, btn31};
    }    
    
}