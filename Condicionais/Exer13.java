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
public class Exer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("digite um numero: 1 - domingo, 2 = segunda... ");
        int dia = scanner.nextInt();
        
        switch( dia){
            case 1: 
                System.out.println("\ndomingo");
                break;
            case 2:
                System.out.println("\nsegunda-feira");
                break;
            case 3:
                System.out.println("\nterça-feira");
                break;
            case 4:
                System.out.println("\nquarta-feira");
                break;
            case 5:
                System.out.println("\nquinta-feira");
                break;
            case 6:
                System.out.println("\nsexta-feira");
                break;
            case 7:{
                System.out.println("\nsabádo");
                break;
            }
            default:
                System.out.println("numero inválido");
        }    
    }
}
