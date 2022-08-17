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
public class Exer15 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("informe o n-ésimo numero: ");
        numero = scanner.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        for (int i = 3; i <= numero; i++) {

            proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }
    }

}
