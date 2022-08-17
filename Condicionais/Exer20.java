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
public class Exer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int cont = 0;
        
        System.out.println("responda com s ou n");
        System.out.println("telefonou para a vitima? ");
        String p1 = scanner.next();
        
        System.out.println("esteve no local do crime? ");
        String p2 = scanner.next();
        
        System.out.println("mora perto da vítima? ");
        String p3 = scanner.next();
        
        System.out.println("devia para a vitima? ");
        String p4 = scanner.next();
        
        System.out.println("ja trabalhou com a vitima? ");
        String p5 = scanner.next();
        
        if(p1.equalsIgnoreCase("s")){
            cont++;
        }
        if(p2.equalsIgnoreCase("s")){
            cont++;
        }
        if(p3.equalsIgnoreCase("s")){
            cont++;
        }
        if(p4.equalsIgnoreCase("s")){
            cont++;
        }
        if(p5.equalsIgnoreCase("s")){
            cont++;
        }
        
        if(cont == 0){
            System.out.println("inocente");
        }
        else if(cont == 2){
            System.out.println("\nsuspeita");
        }
        else if (cont == 3 || cont == 4){
            System.out.println("\ncúmplice");
        }
        else if(cont == 5){
            System.out.println("\nassassino");
        }
    }
    
}
