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
public class Exer07 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int num, maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("informe numero no index: " + i);
            num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("maior numero informado: " + maior);

    }

}
