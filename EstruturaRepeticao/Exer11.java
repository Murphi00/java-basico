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
public class Exer11 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        int soma = 0;

        System.out.println("digite o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("informe o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("numeros informados: " + n1 + " - " + n2);
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nsoma dos numeros: " + soma);
    }

}
