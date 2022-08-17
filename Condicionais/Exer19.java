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
public class Exer19 {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        double operacao = 0;
        boolean verdadeiro = true;
        
        System.out.println("digite o primeiro numero");
        int n1 = scanner.nextInt();
        
        System.out.println("digite o segundo numero");
        int n2 = scanner.nextInt();
        
        System.out.println("qual operação deseja fazer: +, -, * ou / : ");
        String opc = scanner.next();
        
        switch(opc){
            case "+":
                operacao =  n1 + n2;
                break;
            case "-":
                operacao = n1 - n2;
                break;
            case "*":
                operacao = n1 * n2;
                break;
            case "/":
                operacao = (1.0 * n1) / n2;
                break;
            default:
                System.out.println("opção inválida");
                verdadeiro = false;
        }

        if (verdadeiro) {
            System.out.println("\nresultado: " + operacao);
            if (operacao >= 0) {
                System.out.println("o numero é positivo");
            } else {
                System.out.println("o numero é negativo");
            }

            if (operacao % 2 == 0) {
                System.out.println("o numero é par");
            } else {
                System.out.println("o numero é impar");
            }
        }
    }

}
