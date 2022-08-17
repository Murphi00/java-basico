/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer33 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int inicial, numFinal = 1;
        double soma = 0;
        
        System.out.println("informe o valor de n: ");
        inicial = scanner.nextInt();
        
        /*for(int i = 1,  j = 1; i <= n; i++, j+=2){
            System.out.print(i + "/" + j + " ");
        } */
        
        for (int i = 1; i <= inicial;) {
            soma += i / numFinal;
            System.out.print(i + "/" + numFinal + " ");
            numFinal = i;
            i++;
            numFinal += i;
            
            
        }
        
        System.out.println("soma: " + soma);
    }

}
