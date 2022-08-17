/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetodos;

/**
 *
 * @author alan
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        //System.out.println("estado lampada: " + lampada.ligada);
        lampada.mostrarEstado();
        
        lampada.desligar();
        //System.out.println("estado lampada: " + lampada.ligada);
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
    
}
