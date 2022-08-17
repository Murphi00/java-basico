
package Exception;

/**
 *
 * @author alan
 */
public class Exeception {

    public static void main(String[] args) {
       
        int[] numero = {4, 8, 16, 32, 64};
        int[] denom = {2, 0, 4, 0};

        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.println(numero[i] + " / " + denom[i] + " = "
                        + numero[i] / denom[i]);

            } catch (Exception exc) {
                System.out.println(exc.getMessage());
                exc.printStackTrace();
 
            }
            
            System.out.println("");
        }
    }
    
}
