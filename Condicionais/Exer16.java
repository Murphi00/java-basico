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
public class Exer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("informe o valor de a");
        a = scanner.nextInt();
        
        if(a == 0){
            System.out.println("encerrado");
        }
        
        else{
            System.out.println("informe o valor de b");
            b = scanner.nextInt();
        
            System.out.println("informe o valor de c");
            c = scanner.nextInt();
            
            double delta = (b + b) - (4 * a * c);
            
            if(delta < 0){
                System.out.println("\ndelta negativo");
            }
            
            else{
                System.out.println("delta = " + delta);
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
    
}
