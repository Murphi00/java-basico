/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author alan
 */
public class Exer02 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        //imprimir(Calculadora.somar(2, 0))
        Calculadora.imprimir(Calculadora.somar(2, 0));
        
        Calculadora.imprimir(Calculadora.dividir(6, 7));
        
        Calculadora.imprimir(Calculadora.subtrair(7328232, 934));
        
        Calculadora.imprimir(Calculadora.potencia(2, 8));
    }
     
    /*public static void imprimir(int num){
         System.out.println(num);
     } */
}
