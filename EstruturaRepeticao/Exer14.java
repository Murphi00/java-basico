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
public class Exer14 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int num, contImpar = 0, contPar = 0;

        for (int index = 1; index <= 10; index++) {
            System.out.println("digite o numero no index: " + index);
            num = scanner.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("qunatidade de numero impares: " + contImpar);
        System.out.println("qunatidade de numero pares: " + contPar);
    }

}
