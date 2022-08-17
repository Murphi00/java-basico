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
public class Exer29 {

    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero de A index: " + (i + 1));
            vetorA[i] = scanner.nextInt();
            System.out.println("digite o numero de B index: " + (i + 1));
            vetorB[i] = scanner.nextInt();

            vetorC[i] = vetorA[i];
            vetorC[vetorB.length + (i)] = vetorB[i];
        }
        
        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nvetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nvetor C");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        System.out.println();

    }

}
