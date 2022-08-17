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
public class Exer32 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Random random = new Random();
        double[] vetorA = new double[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(10) + 1;

        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("adição");
            for (int x = 1; x <= 10; x++) {
                System.out.print(vetorA[i] + "+" + x + " = " + (vetorA[i] + x) + " -- ");
            }

            System.out.println("\nsubtração");
            for (int x = 1; x <= 10; x++) {
                System.out.print(vetorA[i] + "-" + x + " = " + (vetorA[i] - x) + " -- ");
            }

            System.out.println("\nmultiplicação");
            for (int x = 1; x <= 10; x++) {
                System.out.print(vetorA[i] + "x" + x + " = " + (vetorA[i] * x) + " -- ");
            }

            System.out.println("\ndivisão");
            for (int x = 1; x <= 10; x++) {
                System.out.print(vetorA[i] + "/" + x + " = " + (vetorA[i] / x) + " -- ");
            }

            System.out.println("\n");
        }
    }

}
