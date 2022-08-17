/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.util.Random;

/**
 *
 * @author alan
 */
public class Exer35 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Random random = new Random();
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(10) + 1;

            System.out.println("numero: " + vetorA[i]);
            for (int j = 1; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

}
