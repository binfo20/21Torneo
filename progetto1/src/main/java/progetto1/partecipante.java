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

    /**
     *
     */
    protected String nome;

    /**
     *
     */
    protected  String cognome;

    /**
     *
     */
    protected  int id;

    /**
     *
     * @param nome
     */
    public void setNome(String nome){
this.nome=nome;
}
 
    /**
     *
     * @return
     */
    public String getNome(){
return nome;
}

    /**
     *
     * @param cognome
     */
    public void setCognome(String cognome){
this.cognome=cognome;
}

    /**
     *
     * @return
     */
    public String getCognome(){
return cognome;
}

    /**
     *
     * @param id
     */
    public void setId(int id){
this.id=id;
}

    /**
     *
     * @return
     */
    public int getId(){
return id;
}

}
