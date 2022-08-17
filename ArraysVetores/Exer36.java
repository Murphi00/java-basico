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
public class Exer36 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        double[] vetorA = new double[11];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = Math.pow(2, i);
            
            System.out.println("numero: " + i + " el. ex. 2 = " + vetorA[i]);
        }
    }
    
}
