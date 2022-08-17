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
public class Exer18 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite um numero");
        int num = scanner.nextInt();
        
        if(num % 2 == 0){
            System.out.println("numero par");
        }
        else{
            System.out.println("numero impar");
        }
    }
    
}
