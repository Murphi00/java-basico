/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o " + (i + 1) + "° numero: ");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = sqrt(vetorA[i]);
        }

        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        
        DecimalFormat df = new DecimalFormat("###,###.###"); //formatar numero em decimal
        
        System.out.println("\nVetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print((i+1) + "° ");
            System.out.println(df.format(vetorB[i]) + " ");
        }

        System.out.println("");
    }
}
