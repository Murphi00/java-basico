/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer03 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("informe um num: ");
            num = scanner.nextInt();
            
            if(num < 0){
                System.out.println("numero invalido");
            }
            
        } while(num < 0); //roda ate a condição for verdadeira
       
        Calculadora.imprimir(Calculadora.fatorial(num));
    }
    
}
