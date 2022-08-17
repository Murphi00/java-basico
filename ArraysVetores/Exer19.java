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
public class Exer19 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("digite a nota 1 do index: " + i);
            notas1[i] = scanner.nextDouble();
            System.out.println("digite a nota 2 do index: " + i);
            notas2[i] = scanner.nextDouble();

            resultados[i] = notas1[i] / notas2[i];
        }

        System.out.println("Notas 1: ");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }

        System.out.println("\nNotas 2: ");
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }

        for (int i = 0; i < resultados.length; i++) {

            if (resultados[i] >= 7) {
                System.out.println(resultados[i] + " -  Aprovado");
            } else {
                System.out.println(resultados[i] + " -  Reprovado");
            }
        }

    }

}
