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
public class Exer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int percentual = 0;
        double salario;
        double valorAumento;
        double salarioFinal;
        
        System.out.println("digite o salário ");
        salario = scan.nextDouble();
        
        if(salario  <= 280){
            percentual = 20;
        }
        
        else if(salario > 280 && salario < 700){
            percentual = 15;
        }
        
        else if(salario >= 700 && salario < 1500){
            percentual = 10;
        }
        
        else if(salario >= 1500 ){
            percentual = 5;
        }
        
        else{
            System.out.println("valor inválido");
        }
        
        valorAumento = (salario / 100) * percentual;
        salarioFinal = salario + valorAumento;
        
        
        System.out.println("Salário: " +  salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + valorAumento);
        System.out.println("Salário Ajustado: " + salarioFinal);
        
    }
    
}
