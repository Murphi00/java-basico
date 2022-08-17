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
public class Exer18 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int indexMaior = 0, indexMenor = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("digite a idade na posição: " + i);
            idades[i] = scanner.nextInt();

            if (idades[i] >= maiorIdade) {
                maiorIdade = idades[i];
                indexMaior = i;
            } else if (idades[i] <= menorIdade) {
                menorIdade = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("idades adicionados no vetor");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        System.out.println("maior idade: " + maiorIdade + " posição: " + indexMaior);
        System.out.println("menor idade: " + menorIdade + " posição: " + indexMenor);
    }

}
