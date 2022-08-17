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
public class Exer29 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        boolean primo;
        int numero;

        System.out.println("informe um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {

            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % 2 == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(i);

            }
        }

    }

}
