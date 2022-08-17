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
public class Lampada {
    String pais;
    String marca;
    String tipo;
    int tensao;
    int potencia;
    String cor;
    int garantia;
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if(ligada){
            System.out.println("lampada ligada");
        } else{
            System.out.println("lampada desligada");
        }
    }
    
    void mudarEstado(){
        if(ligada){
           desligar();
        } else{
            ligar();
        }
    }
}
