/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;
import java.util.Scanner;
/**
 *
 * @author gramm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int conta=1; 
       int partecipanti;
       int input_id,risultato1,risultato2;
       String nom;
       String cognom;
       InputEcontrollo fase1=new InputEcontrollo();
        System.out.println("Inserisci il numero dei partecipanti");
        partecipanti=in.nextInt();
       fase1.setN_part(partecipanti);
       for(int i=0; i<fase1.n_part; i++) {fase1.a[i]  = new partecipante();}
       for(int i=0;i<fase1.n_part;i++){
           System.out.println("Inserisci il nome del " + conta +" partecipante");
           nom=in.next();
           System.out.println("Inserisci il cognome del " + conta +" partecipante");
           cognom=in.next();
           System.out.println("Inserisci numero identificativo del " + conta +"partecipante");
           input_id=in.nextInt();
           if(fase1.controlloID(input_id)==true){
               fase1.inizializza(nom,cognom,input_id,i);
               conta++;
           }
           else{
               System.out.println("Input sbagliato");
               i--;
           }
       }
       Accoppiamento torneo2=new Accoppiamento();
       int h=0;
       while(fase1.n_part!=1){
       torneo2.random();
       for(int i=0;i<fase1.n_part/2;i++){        
       System.out.println(torneo2.sfide1(h));
       System.out.println("Inserisci il punteggio del 1 partecipante");
       risultato1=in.nextInt();
       System.out.println("Inserisci il punteggio del 2 partecipante");
       risultato2=in.nextInt();
       torneo2.sfide2(risultato1, risultato2, h);
       h=h+2;
       }
       System.out.println(fase1.n_part);
       if((fase1.n_part % 2) !=0 && fase1.n_part!=1){
        fase1.n_part++;
        }
       fase1.n_part=fase1.n_part/2;
       h=0;
    }
       
       System.out.println(torneo2);
       
       
       
       
}
}