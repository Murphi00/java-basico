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
public class Exer19 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
       
        Scanner scanner = new Scanner(System.in);
        
        int qtdNotas, cont = 0;
        double nota, soma = 0;
        
        
        System.out.println("informe o numero de notas: ");
        qtdNotas = scanner.nextInt();
        
        for(int i = 0; i < qtdNotas; i++){
            System.out.println("informe a nota " + (i+1) + ": ");
            nota = scanner.nextDouble();
            
            soma+= nota;
            cont++;
        }
        
        System.out.println("media das notas: " + (soma/cont));
    }
    
}
