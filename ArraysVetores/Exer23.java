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
public class Exer23 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        int[] vetorA = new int[10];
        Random randon = new Random();
        
        for(int index = 0; index < vetorA.length; index ++){
            vetorA[index] = randon.nextInt(2) + 1;
            System.out.print(vetorA[index] + " ");
        }
        
        //verificar
        boolean impar = false;
        int cont = 0;
        
        while(impar != true || cont == vetorA.length){
            
            if(vetorA[cont] % 2 != 0){
                System.out.println("\nnumero impar encontrado: " + vetorA[cont]);
                impar = true;
                break;
            }
            cont++;
        }
        
        if(impar == false){
            System.out.println("todos numeros sao pares");
        }
    }
    
}
