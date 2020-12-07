/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;

import static progetto1.InputEcontrollo.n_teste;
import static progetto1.InputEcontrollo.n_part;
import static progetto1.InputEcontrollo.a;
import static progetto1.InputEcontrollo.part_max;
/**
 *
 * @author gramm
 */
public class Accoppiamento {

    /**
     *
     */
    protected int coppie[]=new int[64];    
//protected int fase_succ[]=new int[64];
 //int nonteste=n_teste; 

    /**
     *
     */
    protected   int [][] risultati=new int[2][63];

    /**
     *
     */
    protected String finale="Torneo:" ;
    int part_dis=0;
    
    /**
     *
     * @param b
     */
    public void evoluzioneStringa (int b){ 
            for(int i=0;i<part_max;i++){ 
                if(coppie[b]==a[i].id){
                   finale = finale + "\n" + a[i].getNome()+ " " + a[i].getCognome() + " " + risultati[0][b];    
                }
            }
        finale = finale +  "\n" + "vs" + "\n";   
            for(int j=0;j<part_max;j++){ 
                if(coppie[b+1]==a[j].id){
                    finale = finale + a[j].getNome() + " " + a[j].getCognome() + " " + risultati[1][b];    
                }
            }    
  
        finale=finale + "\n" + "**************";
    
}
        
    /**
     *
     * @param b
     * @return
     */
    public String sfide1(int b){
    String partita="";
    for(int i=0;i<part_max;i++){ 
    if(coppie[b]==a[i].id){
    partita = a[i].getNome() + " " + a[i].getCognome() + " " + "vs";  
    }
}

for(int j=0;j<part_max;j++){ 
    if(coppie[b+1]!=a[j].id){
    }
    else{
    partita = partita + " " + a[j].getNome() + " "+ a[j].getCognome()+ " ";
    break;    
    }
}    
 
return partita;
       
}
    
    /**
     *
     * @param ris1
     * @param ris2
     * @param b
     */
    public void sfide2(int ris1,int ris2, int b){
     risultati[0][b]=ris1;
     risultati[1][b]=ris2;
     evoluzioneStringa(b);             
        if(ris1>=ris2){
            for(int i=0;i<part_max;i++){ 
                if(coppie[b+1]==a[i].id){
                    if(a[i].id<17){
                        n_teste--;
                    }
                a[i].id=0;
                }
            }
        }
    else{
        for(int i=0;i<part_max;i++){ 
            if(coppie[b]==a[i].id){ 
                if(a[i].id<17){
                    n_teste--;
                }
              a[i].id=0;
            }
        }       
    }

  }

    /**
     *
     */
    public void random(){
     // int giri=0;
     int pos=0;
     int nonteste=n_teste;
     int nonpart=n_part-n_teste;
     int swap1=0;
     int swap2=0;
     
     boolean control1=false;
     boolean control2=false;
     int conta=0;
     int part_rim=n_part;
     
     int casuale=0;
     int casuale2=0;
     int casuale3=0;
     int casuale_disp =0;
     int[] array_cont=new int[64];
     
      //if(part_dis!=0){
          //array_cont[conta]=part_dis;
          //conta++;
        // }
      
    for(int t=0;t<part_max;t++){
        if(a[t].id!=0){
            array_cont[conta]=a[t].id;
            conta++;
        }
    }
     
     boolean control3=false;
     
        if((n_part % 2) !=0){
            while(control3==false){
              casuale3 = (int)(Math.random()*part_max);
                if(nonteste!=0){
                    if(array_cont[casuale3]<17 && array_cont[casuale3]!=0 ){
                       swap1 = array_cont[casuale3];
                       array_cont[casuale3]= array_cont[part_rim-1];
                       array_cont[part_rim-1]=swap1;
                       casuale3=swap1;
                       nonteste--;
                       part_rim--;
                       control3=true;
                    }
                }
                else{
                    if(array_cont[casuale3]!=0){
                      swap1 = array_cont[casuale3];
                      array_cont[casuale3]= array_cont[part_rim-1];
                      array_cont[part_rim-1]=swap1;
                      casuale3=swap1;
                      nonpart--;
                      part_rim--;
                      control3=true;
                    }   
                }
     
            }
        }
    
     
     
     
     
     
     
     
        for(int i=0;i<n_part/2;i++){
         
     //while(control1==false){
           casuale = (int)(Math.random()*part_rim);
     //for(int l=0;l<n_part;l++){
     //System.out.println("giro1"+giri);
     //giri++;
            if(array_cont[casuale]!=0){
               swap1 = array_cont[casuale];
               array_cont[casuale]= array_cont[part_rim-1];
               array_cont[part_rim-1]=swap1;
               casuale=swap1;
               part_rim--;
            }
        // giri++;
     //} 
     
     //}
            while(control2==false){
              casuale2 = (int)(Math.random()*part_rim); 
     //System.out.println("giro2"+giri);
      //System.out.println("giri "+ giri);
        // giri++;
                if(array_cont[casuale2]!=0){
         // System.out.println("giri "+ giri);
         //giri++;
                    if(nonteste==nonpart){
         
                        if( casuale>=17 && array_cont[casuale2]<17){
                           swap2 = array_cont[casuale2];
                           array_cont[casuale2]= array_cont[part_rim-1];
                           array_cont[part_rim-1]=swap2;
                           casuale2=swap2;
                           part_rim--;
                           control2=true;  
                        }
                       else if( casuale<17 && array_cont[casuale2]>=17){
                          swap2 = array_cont[casuale2];
                          array_cont[casuale2]= array_cont[part_rim-1];
                          array_cont[part_rim-1]=swap1;
                          casuale2=swap2;
                          part_rim--;
                          control2=true;
                        }
                        else {
                        }
                    } 
                    else{
                      swap2 = array_cont[casuale2];
                      array_cont[casuale2]= array_cont[part_rim-1];
                      array_cont[part_rim-1]=swap1;
                      casuale2=swap2;
                      part_rim--;
                      control2=true;
                    }
                }   
            }
     
     // controllo normale
     control2=false;
      
     coppie[pos]=casuale;
     coppie[pos+1]=casuale2;
   
     part_dis=casuale3;
     
     pos=pos+2;
     if(casuale<=17){
     nonteste--; 
     }
     else{
      nonpart--;    
     }
     if(casuale2<=17){
     nonteste--; 
     }
     else{
      nonpart--;    
     }
     }
         
}
 
    /**
     *
     */
    public void String_vincitore(){
        for(int i=0;i<part_max;i++){ 
            if(a[i].id!=0){
               finale = finale + "\n" + a[i].getNome()+ " " + a[i].getCognome() + " " + "ha vinto il torneo!";  
            }  
        }
    }
 
    /**
     *
     * @return
     */
    @Override
public String toString() {
    return finale;
}

}
    
