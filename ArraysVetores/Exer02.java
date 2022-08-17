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
public class Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i ++){
            System.out.println("digite o " + (i + 1) + "° numero: ");
            vetorA[i] = scanner.nextInt();
            
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.println("Vetor A");
        for(int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("\nVetor B");
        for(int i = 0; i < vetorB.length; i ++){
            System.out.print(vetorB[i] + " ");
        }
        
        System.out.println("");
    }
    
}
