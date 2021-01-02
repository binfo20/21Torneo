
package javafxapplication1;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.util.ArrayList;

public class Controller {
    
    public ArrayList<Button> array = new ArrayList<Button>();
    
    public void inizializza(){
        for(int i = 1; i <= 31; i++) {
            array.add(new Button("btn"+i));
        }
    }
    
    public void handle(ActionEvent e){
        /*int i, index = 16;
        for(i = 0; i<array.length; i++){
            if(e.getSource()==array[i]) break;
        }
        if(i>1){
            for(int n = i; n>1; n-=2){
                index++;
            }
        }
        array[index].setText(array[i].getText());
        */
        array.get(30).setText("WINNER"); //prova, che non funziona
    }
    
    public void reset(){
        for(int i = 16; i<31; i++){
            array.get(i).setText("");
        }
    }
    
}
