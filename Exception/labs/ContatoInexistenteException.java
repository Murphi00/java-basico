
package Exception.labs;

/**
 *
 * @author alan
 */
public class ContatoInexistenteException extends Exception{
    
    private String nome;

    public ContatoInexistenteException(String nome) {
        this.nome = nome;
    } 
    
    @Override
    public String getMessage() {
        return "Contato: " + this.nome + " não existe na agenda";
    } 
}
