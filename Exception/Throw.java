
package Exception;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Throw {
    public static void main(String[] args) {
        
        System.out.println("informe um numero decimal: ");
        
        try {
            double num =  lerNumero();
            System.out.println("numero informado: " + num);
        } catch (Exception ex) {
            System.out.println("entrada invalida");
        }
        
        System.out.println("finalizado");
    }
    
    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        
        return num;
    }
}
