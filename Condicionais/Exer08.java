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
public class Exer08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in); 
       
       double p1, p2, p3;
       
        System.out.println("Digite o primeiro preço: ");
        p1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo preço: ");
        p2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro preço: ");
        p3 = scanner.nextDouble();
        
        if(p1 <= p2 && p1 <= p3){
            System.out.println("primeiro produto mais barato: " + p1);
        }
        
        else if(p2 <= p1 && p2 <= p3){
            System.out.println("segundo produto mais barato: " + p2);
        }
        
        else if(p3 <= p1 && p3 <= p2){
            System.out.println("terceiro produto mais barato: " + p3);
        }
        
        else{
            System.out.println("preços iguais");
        }
    }
    
}
