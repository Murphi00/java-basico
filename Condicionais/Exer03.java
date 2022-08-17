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
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um letra F ou M: ");
        String input = scan.next();
        
        
        if(input.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
        }
        
        else if( input.equalsIgnoreCase("m")){
            System.out.println(" M - masculino");
        }
        else{
            System.out.println("sexo inválido");
        }
    }
    
}
