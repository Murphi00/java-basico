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
public class Exer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o " + (i + 1) + "° numero vetor A: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o " + (i + 1) + "° numero vetor B: ");
            vetorB[i] = scanner.nextInt();

            vetorC[i] = (vetorA[i] / vetorB[i]) * 1.0;
        }
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        System.out.println("Vetor C");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(df.format(vetorC[i]) + " ");
        }

        System.out.println("");
    }

}
