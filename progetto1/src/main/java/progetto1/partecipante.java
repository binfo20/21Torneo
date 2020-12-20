
package progetto1;

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
     * @param nome
     */
    public void setNome(String nome){ this.nome=nome; }
 
    /**
     * @return nome
     */
    public String getNome(){ return nome; }

    /**
     * @param cognome
     */
    public void setCognome(String cognome){ this.cognome=cognome; }

    /**
     * @return cognome
     */
    public String getCognome(){ return cognome; }

    /**
     * @param id
     */
    public void setId(int id){ this.id=id; }

    /**
     * @return id
     */
    public int getId(){ return id; }

}
