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
public class Exer15 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero na posição: " + i);
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 != 0) {
                cont++;
            }
        }
        
        int par = vetorA.length - cont;
        double porPar = (par * 100) / vetorA.length;
        double porImpar = 100 - porPar;
        
        System.out.println("numeros adicionados no vetor");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("porcentagem par: " + porPar);
        System.out.println("porcentagem impar: " + porImpar);
    }

}
