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
public class Exer17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o ano: ");
        int ano = scanner.nextInt();
        
        if(ano % 4 == 0 && ano % 100 != 0 ||  ano % 400 == 0){
            System.out.println("ano bissesto");
        }
        else{
            System.out.println("não eh bissesto");
        }
    }
    
}
