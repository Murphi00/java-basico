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
public class Exer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        
        System.out.println("digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        double media = (n1 + n2) / 2;
        String aproveitamento = "";
        String situacao = "";
        
        if(media >= 9 && media <= 10){
            aproveitamento = "A";
            situacao = "APROVADO";
        }
        
        else if(media >= 7 && media < 9){
            aproveitamento = "B";
            situacao = "APROVADO";
        }
        
        else if(media >= 6.5 && media < 7){
            aproveitamento = "C";
            situacao = "APROVADO";
        }
        
        else if(media >= 4 && media < 6){
            aproveitamento = "D";
            situacao = "REPROVADO";
        }
        
        else if(media < 0 && media < 4){
            aproveitamento = "E";
            situacao = "REPROVADO";
        }
        
        System.out.println("\nnota 1: " + n1);
        System.out.println("\nnota 2: " + n2);
        System.out.println("\nmedia: " + media);
        System.out.println("\nSituação: " + situacao);
        System.out.println("\nconceito: " + aproveitamento);
    }
    
}
