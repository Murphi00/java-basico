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
public class Exer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entre com primeiro numero: ");
        int n1 = scan.nextInt();
        
        System.out.println("entre com segundo numero: ");
        int n2 = scan.nextInt();
        
        System.out.println("entre com terceiro numero: ");
        int n3 = scan.nextInt();
        
        if(n1 >= n2 && n1 >= n3){
            System.out.println("o numero " + n1 + " é maior");
        }
        
        else if(n2 >= n1 && n2 >= n3){
            System.out.println("o numero " + n2 + " é maior");
        }
        
        else if(n3 >= n1 && n3 >= n2) {
            System.out.println("o numero " + n3 + " é maior");
        }
        
    }
    
}
