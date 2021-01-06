
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
    
    private int button_control = 1;
    private int[] punteggi;
    private int temp;
   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(button_control==1){
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
            temp = b+n-17;
            button_control = 0;
        }
    }
    
    @FXML
    private void invioButton(ActionEvent event){
        String text = punteggio.getText();
        int number; 
        String valueOfNumber;
        try{
            number = Integer.valueOf(text);
            valueOfNumber = String.valueOf(number);
        }
        catch(Exception e){
            label.setText("HEY! INSERISCI UN NUMERO VERO!");
            return;
        }
        if(button_control==0){
            label.setText("Ok, ha vinto con " + valueOfNumber + " punti!");
            punteggi[temp] = number;
            button_control = 1;
            punteggio.setText(null);
            if(!buttons[30].getText().equals("")){
                label.setText("Il torneo è stato vinto da: " + buttons[30].getText() + " con " + valueOfNumber + " punti!");
            }
        }
        if(button_control==2){
            label.setText(buttons[number-1].getText() + " ha vinto con " + punteggi[number-17] + " punti!");
        }
    }
    
    @FXML
    private void mostraPunteggio(ActionEvent event){
        label.setText("Di quale posizione vuoi vedere il punteggio? 17->31");
        button_control = 2;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        buttons = new Button[]{
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, 
            btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, 
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, 
            btn30, btn31};
        punteggi = new int[15];
    }    
    
}