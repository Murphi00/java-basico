
package Exception;

/**
 *
 * @author alan
 */
public class NaoInteiroException extends Exception{
    protected int deno;
    protected int num;
    
    public NaoInteiroException(int num, int deno){
        super();
        this.deno = deno;
        this.num = num;
    }

    @Override
    public String toString() {
        return "resultado não é numero inteiro";
    }
    
    
     
}
