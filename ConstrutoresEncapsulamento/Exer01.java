/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstrutoresEncapsulamento;

/**
 *
 * @author alan
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] alan) {
        
        Lampada lampada = new Lampada(true);
        
        //lampada.ligar();
        System.out.println(lampada.mostrarEstado());
    }
    
}
