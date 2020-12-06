/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;
/**
 *
 * @author gramm
 */
public class partecipante {
protected String nome;
protected  String cognome;
protected  int id;

public void setNome(String nome){
this.nome=nome;
}
 
public String getNome(){
return nome;
}

public void setCognome(String cognome){
this.cognome=cognome;
}

public String getCognome(){
return cognome;
}

public void setId(int id){
this.id=id;
}

public int getId(){
return id;
}

}
