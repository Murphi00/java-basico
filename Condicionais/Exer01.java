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
 * 
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        int n1, n2;
        
        System.out.println("digite o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("digite o segundo numero: ");
        n2= scanner.nextInt();
        
        if(n1 > n2){
            System.out.println("maior numero: " + n1);
        }
        
        else if(n2 >= n1){
            System.out.println("maior numero: " + n2);
        }
        
        else{
            System.out.println("numeros iguais");
        }
               
    }
    
}
