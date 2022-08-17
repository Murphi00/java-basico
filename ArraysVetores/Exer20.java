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
public class Exer20 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe a cotação do dolar do index: " + i);
            cotacao = scanner.nextDouble();
            
            vetorA[i] = cotacao * (i+1);
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
    }

}
