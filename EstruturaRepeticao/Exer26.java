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
public class Exer26 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int fat;

        System.out.println("informe o numero: ");
        fat = scanner.nextInt();

        System.out.println("Fatorail de: " + fat);

        System.out.print(fat + "! = " + fat);
        for (int i = (fat - 1); i > 0; i--) {
            fat *= i;
            System.out.print(" . " + i);
        }

        System.out.print(" = " + fat);
        System.out.println();
    }

}
