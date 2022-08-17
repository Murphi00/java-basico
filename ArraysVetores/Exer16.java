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
public class Exer16 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaInferior = 0, somaIgual = 0, somaSuperior = 0;
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero na posição: " + i);
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] < 15) {
                somaInferior += vetorA[i];
            } else if (vetorA[i] == 15) {
                somaIgual += vetorA[i];
            } else {
                somaSuperior += vetorA[i];
                cont++;
            }

        }

        System.out.println("numeros adicionados no vetor");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("soma dos numeros menores que 15: " + somaInferior);
        System.out.println("soma dos numeros iguais que 15: " + somaIgual);
        System.out.println("media dos numeros maior que 15: " + somaSuperior/cont);

    }

}
