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
public class Contador {
    private static int cont; // atributo static é compratilhado com todas as instancias da classe
    
    public Contador(){
        cont++;
    }
    
    public static void zerarCont(){
        cont = 0;
    }
    
    public static void incrementarCont(){
        cont++;
    }

    public static int obterCont() {
        return cont;
    }
    
     
}
