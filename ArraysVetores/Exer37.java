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
public class Exer37 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(10) + 1;

            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }

        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nvetor B ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
