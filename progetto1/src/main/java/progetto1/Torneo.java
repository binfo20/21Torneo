
package progetto1;

import static progetto1.InputEcontrollo.n_teste;
import static progetto1.InputEcontrollo.n_part;
import static progetto1.InputEcontrollo.a;
import static progetto1.InputEcontrollo.part_max;

public class Torneo {

    /**
     * this is the array where are memoryze the couple that have to match for pass in the next phase
     */
    protected int coppie[]=new int[64];    
    //protected int fase_succ[]=new int[64];
    //int nonteste=n_teste; 
    
    /**
     * this is were the results are memorize
     */
    protected   int [][] risultati=new int[2][63];

    /**
     * this is the synthase of the tournament
     */
    protected String finale="Torneo:" ;
    int part_dis=0;
    
    /**
     *@param b is used to identify the couple
     *this function modify the string 
     */
    public void evoluzioneStringa (int b){ 
        for(int i=0;i<part_max;i++){ 
            if(coppie[b]==a.get(i).id)
                finale = finale + "\n" + a.get(i).getNome()+ " " + a.get(i).getCognome() + " " + risultati[0][b];
        }
        finale = finale +  "\n" + "vs" + "\n";  
        for(int j=0;j<part_max;j++){
            if(coppie[b+1]==a.get(j).id)
                finale = finale + a.get(j).getNome() + " " + a.get(j).getCognome() + " " + risultati[1][b];
        }  
        finale=finale + "\n" + "**************";
    }
        
    /**
     * @param b is used to identify the couple
     * 
     * @return a string with the name of the participants
     */
    public String sfide1(int b){
        String partita="";
        for(int i=0;i<part_max;i++){ 
            if(coppie[b]==a.get(i).id)
                partita = a.get(i).getNome() + " " + a.get(i).getCognome() + " " + "vs"; 
        }
        for(int j=0;j<part_max;j++){ 
            if(coppie[b+1]!=a.get(j).id){}
            else{
                partita = partita + " " + a.get(j).getNome() + " "+ a.get(j).getCognome()+ " ";
                break;    
            }
        } 
        return partita;
    }
    
    /**
     * @param ris1 the points of the first participant
     * @param ris2 the points of the second participant
     * @param b is used to identify the couple
     */
    public void sfide2(int ris1,int ris2, int b){
        risultati[0][b]=ris1;
        risultati[1][b]=ris2;
        evoluzioneStringa(b);             
        if(ris1>=ris2){
            for(int i=0;i<part_max;i++){ 
                if(coppie[b+1]==a.get(i).id){
                    if(a.get(i).id<17) n_teste--;
                    a.get(i).id=0;
                }
            }
        }
        else{
            for(int i=0;i<part_max;i++){ 
                if(coppie[b]==a.get(i).id){
                    if(a.get(i).id<17) n_teste--;
                    a.get(i).id=0;
                }
            } 
        }
    }
    
    /**
     * this create an array with the id in a random order 
     * 
     * the array is used for do the match
     * 
     * if the participants are odd one of those will pass in the next phase automatically
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
            if(a.get(t).id!=0){
                array_cont[conta]=a.get(t).id;
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
            if(casuale<=17) nonteste--; 
            else nonpart--;    
            if(casuale2<=17) nonteste--; 
            else nonpart--;
        }
    }
 
    /**
     * modify the string finale with the neme of the winner 
     */
    public void String_vincitore(){
        for(int i=0;i<part_max;i++){ 
            if(a.get(i).id!=0){
               finale = finale + "\n" + a.get(i).getNome()+ " " + a.get(i).getCognome() + " " + "ha vinto il torneo!";  
            }  
        }
    }
 
    /**
     * @return the synthase of the tournament
     */
    @Override
    public String toString() { return finale; }
    
}
    
