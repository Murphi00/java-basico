
package Exception;

/**
 *
 * @author alan
 */
public class TesteMinhaException {

    public static void main(String[] args) {
        
        int[] numero = {4, 8, 16, 3, 32, 64};
        int[] denom = {2, 0, 4, 0};

        for (int i = 0; i < numero.length; i++) {
            try {
                if(numero[i] % 2 != 0){
                    throw new NaoInteiroException(numero[i], denom[i]);
                }
                System.out.println(numero[i]  + " / " + denom[i] + " = "
                        + numero[i] / denom[i]);
            } 
            
            catch (NaoInteiroException | ArithmeticException | ArrayIndexOutOfBoundsException exc ) {
                System.out.println(exc.getMessage());
                exc.printStackTrace();
            } 
            
            System.out.println("");
        }
    } 
}
