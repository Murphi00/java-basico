/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer31 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int indexB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o numero na posição " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[indexB] = vetorA[i];
                indexB++;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[indexB] = vetorA[i];
                indexB++;
            }
        }

        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nvetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
    }

}
