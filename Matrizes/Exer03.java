/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int qtdPar = 0;
        int qtdImpar = 0;
                
        for(int i = 0; i < matriz.length; i++){
            for(int x = 0; x < matriz[i].length; x++){
                System.out.println("informe o valor da L: " + i + "coluna: " + x);
                matriz[i][x] = scanner.nextInt();
                
                if(matriz[i][x] % 2 == 0){
                    qtdPar++;
                } else{
                    qtdImpar++;
                }
            }
        }
        
        System.out.println("quantidade numeros pares: " + qtdPar);
        System.out.println("quantidade numeros impares: " + qtdImpar);
    }
    
}
