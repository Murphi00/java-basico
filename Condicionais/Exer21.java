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
public class Exer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double valorA = 1.90;
        double valorG = 2.50;
        double desconto = 0;
        double total = 0;
        
        System.out.println("digite a quantidade de litros: ");
        double qtdL = scanner.nextDouble();
        System.out.println("escolha o tipo de gasolina: G - gasolina e A - alcool ");
        String tipo = scanner.next();
        
        if(tipo.equalsIgnoreCase("a")){
           if(qtdL >=0 && qtdL <= 20){
               desconto =  3;
           }
           else{
               desconto = 5;
           }
           
           total = valorA * qtdL;
        }
        
        else if(tipo.equalsIgnoreCase("g")){
            if(qtdL >= 0 && qtdL <= 20){
                desconto = 4; 
            }
            
            else{
                desconto = 6;
            }
            
            total = valorG * qtdL;
        }
        
        double valorDesc = (total / 100) * desconto;
        double valorFinal = total - valorDesc;
        
        System.out.println("valor a ser pago: " + valorFinal);    
    }
    
}
