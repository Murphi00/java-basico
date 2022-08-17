/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

import java.util.Random;

/**
 *
 * @author alan
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] numerosAleatorios = new int[4][4];
        Random random = new Random();
        
        for(int i =0; i < numerosAleatorios.length; i ++){
            for(int x = 0; x < numerosAleatorios[i].length; x ++){
                numerosAleatorios[i][x] = random.nextInt(100);
                System.out.print(numerosAleatorios[i][x] + "  ");
            }
            System.out.println("");
        }
        
        int maior = Integer.MIN_VALUE; //inicializa com um valor minimo
        int linha = 0;
        int coluna = 0;
        
        for(int i = 0; i < numerosAleatorios.length; i ++){
            for(int x = 0; x < numerosAleatorios[i].length; x++){
                if(numerosAleatorios[i][x] >= maior){
                    maior = numerosAleatorios[i][x];
                    linha = i;
                    coluna = x;
                }
            }
        }
        
        System.out.println("maior valor: " + maior);
        System.out.println("linha: " + linha);
        System.out.println("coluna: " + coluna);
    }
    
}
