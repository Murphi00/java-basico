/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[a.length];
        
        for(int i = 0; i < a.length; i++){
            System.out.println("digite o " + (i+1) +"° numero: " );
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }
        
        System.out.println("vetor A");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        
        System.out.println("\nvetor B");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] +" ");
        }
        
        System.out.println("");
        
    }
    
}
