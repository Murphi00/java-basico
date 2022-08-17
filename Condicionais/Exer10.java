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
public class Exer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o turno M-matutino, V-Vespertino ou N-Noturno: ");
        String turno = scan.next();
        
        switch(turno){
            case "M":
            case "m": System.out.println("bom dia!"); break;
            case "v":
            case "V": System.out.println("boa tarde!"); break;
            case "n":
            case "N": System.out.println("boa noite!"); break;
            default: System.out.println("turno inválido");
        }
    }
    
}
