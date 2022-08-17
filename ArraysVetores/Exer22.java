/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysVetores;

/**
 *
 * @author alan
 */
public class Exer22 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;
        for(int i = 0; i < vetorA.length; i ++){
            vetorA[i] = (int)Math.round(Math.random() * 1);
            
            if(vetorA[i] == 0){
                qtd0++;
            } else{
                qtd1++;
            }
        }
        
        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (100 * qtd1) / vetorA.length;
        
        System.out.println("vetor A");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("porcentagem 0: " + porc0);
        System.out.println("porcentagem 1: " + porc1);
    }
    
}
