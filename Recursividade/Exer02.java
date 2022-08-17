/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer02 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("informe um numero: ");
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("numero invalido");
            }
        } while (num <= 0);
        
        imprimir(Calculadora.somatorio(num));
    }

    public static void imprimir(int num) {
        System.out.print(num + " ");
    }
    
}
