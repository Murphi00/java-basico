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
public class Exer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o lado 1: ");
        double l1 = scanner.nextDouble();
        
        System.out.println("Digite o lado 2");
        double l2 = scanner.nextDouble();
        
        System.out.println("Digite o lado 3");
        double l3 = scanner.nextDouble();
       
        
        if(((l1 + l2)> l3) || ((l1 + l3) > l2) || ((l2 + l3) > 1)){
           
            if(l1 == l2 && l1 == l3 ){
            System.out.println("Triangulo Equilátero");
            }
        
            else if(l1 != l2 && l1 != l3 && l2 != l3){
            System.out.println("trinagulo escaleno");
            }
        
             else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("triangulo isosceles");
            }
        }
        
        else{
            System.out.println("não é um triangulo");
        }
        
        
    }
    
}
