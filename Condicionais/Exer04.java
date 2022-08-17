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
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite uma letra ");
        String input = scan.next();

        /* if(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e")
            || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o")
                || input.equalsIgnoreCase("u")){
            System.out.println("a letra digitada é uma vogal");
        }
        
        else{
            System.out.println("a letra digitada é uma consoante");
        }*/
        if (input.length() > 1) {
            System.out.println("letra inválida");
        } 
        
        else {
            switch (input) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("consoante");
            }

        }
    }

}
