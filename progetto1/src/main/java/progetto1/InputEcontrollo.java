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
public class InputEcontrollo {
    Scanner in = new Scanner (System.in);

    /**
     * array of participants is never 
     */
    static public partecipante a[]=new partecipante[64];
 
    /**
     * numbur max of the participants is never modify
     */
    static public int part_max=0;

    /**
     *  is used for the controll
     */
    protected int dim_num=0;

    /**
     * numbur of the participants actually
     */
    static public int n_part=0;

    /**
     * numbur of the participants that are teste di serie 
     */
    static public int n_teste=0;

    /**
     *
     * @return the numbur of the participants actually
     */
    public int getN_part(){
return n_part;
}

    /**
     *
     * @return the numbur of the participants that are teste di serie  
     */
    public int getN_teste(){
return n_teste;
}

    /**
     *
     * @param n_part a nuber take as input form the user
     */
    public void setN_part(int n_part){
this.n_part=n_part; 
this.part_max=n_part;
}

    /**
     *
     * @param n_teste a nuber take as input form the user
     */
    public void setN_teste(int n_teste){
this.n_teste=n_teste;   
}

    /**
     *
     * @param i position of the name 
     * @return the name of that partecipants
     */
    public String getA(int i){
 return a[i].nome;  
}

    /**
     *
     * @param i position
     * @return the id of these partecipants
     */
    public int getID(int i){
return a[i].id;    
}

    /**
     *
     * @param nom are one of the parameter of partecipante
     * @param cognom are one of the parameter of partecipante
     * @param id_part are one of the parameter of partecipante
     * @param i identify in witch part of the array are memorize the informnation
     */
    public void inizializza(String nom , String cognom , int id_part , int i){
  a[i].nome=nom;
  a[i].cognome=cognom;
  a[i].id=id_part;
  if(a[i].id<17){
  n_teste++;
  }
  dim_num++;
  }

    /**
     *
     * @param id_part the id of this participant that have to be controlled
     * @return if the id it already existing
     * 
     */
    public boolean controlloID(int id_part){
    boolean control=true;
  if(dim_num!=0){
  for(int j=0; j<dim_num;j++){
  if(id_part==a[j].id){
  control=false;    
  }
  }   
  }  
    
  return control;  
}

  }
  /* da fare meglio
  while(control==false){
  b=in.nextInt();
  //if(dim_num-1!=0){
  for(int j=0; j<dim_num-1;j++){
  if(b==numerazione[j]){
  control2=false;    
  }
  }
  
 
   
  if(control2==true){
  control=true; 
   b=a[i].id;
   b=numerazione[dim_num];
   dim_num++;
  }
  
  }
  control=false;
  */
  //}

 
