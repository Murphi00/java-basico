/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer01 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        Scanner scanner = new Scanner(System.in);
        int num ;
        
        do{
            System.out.println("informe a quantidade da sequencia: ");
            num = scanner.nextInt();
            
            if(num <= 0){
                System.out.println("numero invalido");
            }
        } while(num <= 0);
        
        for(int i = 0; i < num; i++){
            imprimir(Calculadora.fibonnaci(i));
        } 
    }
    
    public static void imprimir(int num){
        System.out.print(num + " ");
    }
}
