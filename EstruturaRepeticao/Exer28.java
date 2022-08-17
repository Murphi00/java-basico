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
public class Exer28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean primo = true;
        int numero;

        System.out.println("informe um numero: ");
        numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("numero não é primo ");
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("numero primo");
        }
    }

}
