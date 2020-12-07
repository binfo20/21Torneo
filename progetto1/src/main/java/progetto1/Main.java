/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author gramm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       Scanner in = new Scanner (System.in);
       String risposta;
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
       System.out.println("Vuoi usare il salvataggio precedente? y/n");
       risposta=in.next();
   if("y".equals(risposta)){
                FileReader fr;
                fr=new FileReader("Partecipanti.txt");

                BufferedReader br;
                br=new BufferedReader(fr);

                int s_posizione=0;
                String s_nome,s_cognome,s_id1;
           while(true) {
                s_nome=br.readLine();
                s_cognome=br.readLine();
                s_id1=br.readLine();
                     if(s_nome==null || s_cognome==null || s_id1==null){
                         break;
                        }
                fase1.a[s_posizione].nome=s_nome;
                fase1.a[s_posizione].cognome=s_cognome;
                int s_id2 = Integer.parseInt(s_id1);
                fase1.a[s_posizione].id=s_id2;
                s_posizione++;
            }   
    }
else{
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
                              conta--;
                    }
        }
    } 
       
     // scrivi
    FileWriter w;
    w=new FileWriter("Partecipanti.txt");

    BufferedWriter b;
    b=new BufferedWriter (w);

    for(int l=0; l<fase1.part_max; l++){
      b.write(fase1.a[l].nome+"\n"+fase1.a[l].cognome+"\n"+fase1.a[l].id);
      b.write("\n");
    }
    
      b.flush();
      
      
      
      // leggi 
      /*
    FileReader c;
    c=new FileReader("Partecipanti.txt");

    BufferedReader e;
    e=new BufferedReader(c);

    int conta2=0;
    String s,t, u;
    while(true) {
      s=e.readLine();
      t=e.readLine();
      u=e.readLine();
      if(s==null || t==null || u==null){
        break;
      }
      System.out.println(s);
      fase1.a[conta2].nome=s;
       System.out.println(t);
      fase1.a[conta2].cognome=t;
      int v = Integer.parseInt(u);
      System.out.println(v);
      fase1.a[conta2].id=v;
      conta2++;
    }   
       */
       
       
       
            Accoppiamento fase2=new Accoppiamento();
             int posizione=0;
       while(fase1.n_part!=1){
                 fase2.random();
                      for(int i=0;i<fase1.n_part/2;i++){        
                               System.out.println(fase2.sfide1(posizione));
                               System.out.println("Inserisci il punteggio del 1 partecipante");
                               risultato1=in.nextInt();
                               System.out.println("Inserisci il punteggio del 2 partecipante");
                               risultato2=in.nextInt();
                               fase2.sfide2(risultato1, risultato2, posizione);
                               posizione=posizione+2;
                        }
                      if((fase1.n_part % 2) !=0 && fase1.n_part!=1){
                               fase1.n_part++;
                        }
                 fase1.n_part=fase1.n_part/2;
                 posizione=0;
       //
    }
            fase2.String_vincitore();
            System.out.println(fase2);
       
       
       
       
}
}