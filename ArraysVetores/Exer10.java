/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer10 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o " + (i + 1) + "° numero vetor A: ");
            vetorA[i] = scanner.nextInt();
            
            vetorB[i] = vetorA[i] % 2;
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(df.format(vetorB[i]) + " ");
        }

        System.out.println("");
    }

}
