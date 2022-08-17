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
public class Exer01 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
        Contador cont1 = new Contador(); //não precisa
        Contador cont2 = new Contador();
        
        Contador.incrementarCont();
        System.out.println(Contador.obterCont());
        
        Contador.zerarCont();
        System.out.println(Contador.obterCont());
    }
    
}
