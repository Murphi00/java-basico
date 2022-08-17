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
public class Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x++) {
                numerosAleatorios[i][x] = random.nextInt(100);
                System.out.print(numerosAleatorios[i][x] + "  ");
            }
            System.out.println("");
        }

        int maiorL5 = Integer.MIN_VALUE; //inicializa com um valor minimo
        int menorL5 = Integer.MAX_VALUE;
        
        for(int i = 0; i < numerosAleatorios[5].length; i++){
            if(numerosAleatorios[5][i] > maiorL5){
                maiorL5 = numerosAleatorios[5][i];
            } if(numerosAleatorios[5][i] < menorL5){
                menorL5 = numerosAleatorios[5][i];
            }
        }
        
        System.out.println("maior valor linha 5: " + maiorL5);
        System.out.println("menor valor linha 5: " + menorL5);
        
        int maiorC7 = Integer.MIN_VALUE; //inicializa com um valor minimo
        int menorC7 = Integer.MAX_VALUE;
        for(int i = 0; i < numerosAleatorios.length; i ++){
            if(numerosAleatorios[i][7] > maiorC7){
                maiorC7 = numerosAleatorios[i][7];
            } if(numerosAleatorios[i][7] < menorC7){
                menorC7 = numerosAleatorios[i][7];
            }
        }
        
        System.out.println("maior valor coluna 7: " + maiorC7);
        System.out.println("menor valor coluna 7: " + menorC7);
    }

}
