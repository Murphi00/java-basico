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
public class Exer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int cont = 0;
        
        for(int i = 0; i < vetorA.length; i ++){
            System.out.println("digite o numero na posição: " + i);
            vetorA[i] = scanner.nextInt();
            
            if(vetorA[i] % 2 == 0){
                cont++;
            }      
        }
        
        System.out.println("numeros adicionados no vetor");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("quantidade de numeros pares: " + cont);
    }
    
}
