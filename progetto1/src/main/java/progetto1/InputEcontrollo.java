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
     *
     */
    static public partecipante a[]=new partecipante[64];
 
    /**
     *
     */
    static public int part_max=0;

    /**
     *
     */
    protected int dim_num=0;

    /**
     *
     */
    static public int n_part=0;

    /**
     *
     */
    static public int n_teste=0;

    /**
     *
     * @return
     */
    public int getN_part(){
return n_part;
}

    /**
     *
     * @return
     */
    public int getN_teste(){
return n_teste;
}

    /**
     *
     * @param n_part
     */
    public void setN_part(int n_part){
this.n_part=n_part; 
this.part_max=n_part;
}

    /**
     *
     * @param n_teste
     */
    public void setN_teste(int n_teste){
this.n_teste=n_teste;   
}

    /**
     *
     * @param i
     * @return
     */
    public String getA(int i){
 return a[i].nome;  
}

    /**
     *
     * @param i
     * @return
     */
    public int getID(int i){
return a[i].id;    
}

    /**
     *
     * @param nom
     * @param cognom
     * @param id_part
     * @param i
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
     * @param id_part
     * @return
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

 
