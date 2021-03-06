
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
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 * Si occupa della gestione del torneo, e' il controller del FXML "principale".
 */
public class Controller implements Initializable {
    
    @FXML private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
        btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18,    
        btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28,
        btn29, btn30, btn31;
    @FXML private Label label;
    @FXML private Button[] buttons;
    @FXML private TextField punteggio;
    private int button_control;
    private int[] punteggi;
    private int temp;
   
    /**
    * @param evento che serve a risalire al bottone (partecipante).
    * Tramite il bottone si fa proseguire il giocatore scelto chiedendo di 
    * quanti punti ha vinto. 
    */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(button_control==1){
            Button btn_source = (Button)event.getSource();
            String btn_id = btn_source.getId().replace("btn", "");
            int b = Integer.parseInt(btn_id);
            if(buttons[b-1].getText().equals("")) return;
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
    
    /**
     * invia il numero che e'¨stato scritto nel textfield e controlla che sia 
     * effettivamente un numero, controllando inoltre se il numero si riferisce
     * ad una vittoria o alla posizione del punteggio che si vuole vedere.
     */
    @FXML
    private void invioButton(){
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
            punteggio.setText(null);
            if(!buttons[30].getText().equals("")){
                label.setText("Il torneo e'¨ stato vinto da: " + buttons[30].getText() + " con " + valueOfNumber + " punti!");
            }
        }
        if(button_control==2){
            label.setText(buttons[number-1].getText() + " ha vinto con " + punteggi[number-17] + " punti!");
        }
        button_control = 1;
    }
    
    /**
     * chiede di quale posizione (giocatore) voler vedere il punteggio. 
     */
    @FXML
    private void mostraPunteggio(){
        label.setText("Di quale posizione vuoi vedere il punteggio? 17->31");
        button_control = 2;
    }

    /**
     * salva i dati del torneo in un file di salvataggio .txt.
     */
    @FXML
    public void save() {
        String nick = "", points = ""; //Nick Ã¨ la stringa che verrÃ  inserita all'interno del txt
        nick += buttons[0].getText(); //Legge il primo nick per evitare problemi di sintassi
        points += punteggi[0];
        for(int i = 1; i< 31; i++){ //For usato per leggere tutti i nomi assegnat a bottoni
            nick += "\n" + buttons[i].getText();
        }
        for(int i = 1; i< 15; i++){ //For usato per leggere tutti i punteggi
            points += " " + punteggi[i];
        }
        try {
            BufferedWriter writer_g = new BufferedWriter(new FileWriter("./save_giocatori.txt")); //Genera il file txt nel caso in cui non esista oppure ci scrive dentro
            BufferedWriter writer_p = new BufferedWriter(new FileWriter("./save_punteggi.txt"));
            writer_g.write(nick); // viene traferito il parametro nick da traferire all'interno del txt
            writer_p.write(points);
            writer_g.close(); //chiude le interazioni con il txt
            writer_p.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       
    /**
     * carica i dati del torneo dal file di salvataggio
     */
    @FXML
    public void load() {  
        try {
            File g = new File("save_giocatori.txt"); 
            File p = new File("save_punteggi.txt");
            Scanner read_giocatori = new Scanner(g); 
            Scanner read_punteggi = new Scanner(p);
            for(int i=0;i<31;i++) buttons[i].setText(""); 
            for (int i = 0; i<31; i++) buttons[i].setText(read_giocatori.nextLine());
            for(int i = 0; i<15;i++) punteggi[i] = read_punteggi.nextInt();
            read_giocatori.close();
            read_punteggi.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    }
    
    /**
     * @param giocatori e' un'array di stringhe, viene ricevuto dal Giocatori.java
     * nella fase iniziale del programma. 
     */
    public void transfer(String[] giocatori){ 
        for(int i = 0; i<16; i++) buttons[i].setText(giocatori[i]);
    }
    
    /**
     * inizializza l'array di bottoni e dei punteggi
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        buttons = new Button[]{
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, 
            btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, 
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, 
            btn30, btn31};
        punteggi = new int[15]; 
        button_control = 1;
    }  
   
}