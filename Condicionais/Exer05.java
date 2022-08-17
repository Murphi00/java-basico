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
public class Exer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite a nota 1");
        double n1 = scan.nextDouble();
        
        System.out.println("digite a nota 2");
        double n2 = scan.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        if(media == 10){
            System.out.println("Aprovado  com Distinção");
        }
        
        else if(media >= 7){
            System.out.println("Aprovado");
        }
        
        else {
            System.out.println("Reprovado");
        }
    }
    
}
