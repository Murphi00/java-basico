/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionais;

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
        
        int valor;
        
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("digite um numero: ");
        valor = scanner.nextInt();
        
        if(valor >= 0){
            System.out.println("numero positivo");
        }
        
        else{
            System.out.println("numero negativo");
        }
        
    }
    
}
