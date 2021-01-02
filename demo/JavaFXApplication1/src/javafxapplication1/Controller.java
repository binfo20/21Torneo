
package javafxapplication1;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
        
public class Controller {
 
    public Button[] array;
    
    public void inizializza(){
        array = new Button[31];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Button("btn"+i);
        }
    }
    
    public void handle(ActionEvent e){
        int i, index = 16;
        for(i = 0; i<array.length; i++){
            if(e.getSource()==array[i]) break;
        }
        if(i>1){
            for(int n = i; n>1; n-=2){
                index++;
            }
        }
        array[index].setText(array[i].getText());
    }
    
    public void reset(){
        for(int i = 16; i<31; i++){
            array[i].setText("");
        }
    }
    
}
