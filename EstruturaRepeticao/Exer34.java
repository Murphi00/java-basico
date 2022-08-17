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
public class Exer34 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int n;

        double soma = 0;

        System.out.println("informe o valor de n: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(1 + "/" + i + " ");

            soma += 1 / i;
        }

        System.out.println("soma: " + soma);
    }

}
