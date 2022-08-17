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
public class Exer13 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int base, potencia;

        System.out.println("informe a base: ");
        base = scanner.nextInt();
        System.out.println("informe a potência: ");
        potencia = scanner.nextInt();

        int resultado = base;

        for (int i = 1; i < potencia; i++) {
            resultado *= base;
        }

        System.out.println("resultado: " + resultado);
    }

}
