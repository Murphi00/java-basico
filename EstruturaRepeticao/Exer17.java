/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer17 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("informe o numero: ");
        fatorial = scanner.nextInt();

        for (int i = (fatorial - 1); i > 1; i--) {
            fatorial *= i;
            System.out.println(fatorial + " ");
        }
    }

}
