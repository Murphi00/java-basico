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
public class Exer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o valor da hora: ");
        double valorHora = scanner.nextDouble();
        
        System.out.println("Digite as horas trabalhadas no mês: ");
        int horas = scanner.nextInt();
        
        double salarioBruto = valorHora * horas;
        int percentualIR = 0;
        
        if(salarioBruto <= 900){
            percentualIR = 0;
        }
        
        else if(salarioBruto <= 1500){
            percentualIR = 5;
        }
        
        else if(salarioBruto <= 2500){
            percentualIR = 10;
        }
        
        else{
            percentualIR = 20;
        }
        
        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("\nsalario bruto ( " + horas + " * "+ valorHora + ")  R$ " + salarioBruto);
        System.out.println("\n( - ) IR ( " + percentualIR + "% ) R$ " + ir);
        System.out.println("\n( - ) INSS (10%) " + " R$ " + inss);
        System.out.println("\nFGTS ( 11% ): " + "    R$ " + fgts);
        System.out.println("\nTotal de descontos:   R$ " + totalDescontos);
        System.out.println("\nsalário liquido:      R$ " + salarioLiquido );
    }
    
}
