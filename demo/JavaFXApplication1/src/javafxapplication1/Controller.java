
package javafxapplication1;

import javafx.scene.control.Button;

public class Controller {
 
    public Button[] array;
    
    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28,
            btn29, btn30, btn31;
    
    public void inizializza(){
        array = new Button[31];
        array[0] = btn1;    array[10] = btn11;  array[20] = btn21;  
        array[1] = btn2;    array[11] = btn12;  array[21] = btn22;
        array[2] = btn3;    array[12] = btn13;  array[22] = btn23;
        array[3] = btn4;    array[13] = btn14;  array[23] = btn24;
        array[4] = btn5;    array[14] = btn15;  array[24] = btn25;
        array[5] = btn6;    array[15] = btn16;  array[25] = btn26;
        array[6] = btn7;    array[16] = btn17;  array[26] = btn27;
        array[7] = btn8;    array[17] = btn18;  array[27] = btn28;
        array[8] = btn9;    array[18] = btn19;  array[28] = btn29;
        array[9] = btn10;   array[19] = btn20;  array[29] = btn30;
        array[30] = btn31;
    }
    
    public void b1(){
        btn17.setText(array[0].getText());
    }
    public void b2(){
        btn17.setText(btn2.getText());
    }
    public void b3(){
        btn18.setText(btn3.getText());
    }
    public void b4(){
        btn18.setText(btn4.getText());
    }
    public void b5(){
        btn19.setText(btn5.getText());
    }
    public void b6(){
        btn19.setText(btn6.getText());
    }
    public void b7(){
        btn20.setText(btn7.getText());
    }
    public void b8(){
        btn20.setText(btn8.getText());
    }
    public void b9(){
        btn21.setText(btn9.getText());
    }
    public void b10(){
        btn21.setText(btn10.getText());
    }
    public void b11(){
        btn22.setText(btn11.getText());
    }
    public void b12(){
        btn22.setText(btn12.getText());
    }
    public void b13(){
        btn23.setText(btn13.getText());
    }
    public void b14(){
        btn23.setText(btn14.getText());
    }
    public void b15(){
        btn24.setText(btn15.getText());
    }
    public void b16(){
        btn24.setText(btn16.getText());
    }
    public void b17(){
        btn25.setText(btn17.getText());
    }
    public void b18(){
        btn25.setText(btn18.getText());
    }
    public void b19(){
        btn26.setText(btn19.getText());
    }
    public void b20(){
        btn26.setText(btn20.getText());
    }
    public void b21(){
        btn27.setText(btn21.getText());
    }
    public void b22(){
        btn27.setText(btn22.getText());
    }
    public void b23(){
        btn28.setText(btn23.getText());
    }
    public void b24(){
        btn28.setText(btn24.getText());
    }
    public void b25(){
        btn29.setText(btn25.getText());
    }
    public void b26(){
        btn29.setText(btn26.getText());
    }
    public void b27(){
        btn30.setText(btn27.getText());
    }
    public void b28(){
        btn30.setText(btn28.getText());
    }
    public void b29(){
        btn31.setText(btn29.getText());
    }
    public void b30(){
        btn31.setText(btn30.getText());
    }
    
    public void reset(){
        for(int i = 16; i<31; i++){
            array[i].setText("");
        }
    }
    
}
