/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributos;

/**
 *
 * @author alan
 */
public class Exer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.email = "alan@gmail.com";
        contato.nome = "alan";
        contato.endereco = "rua manoel dias";
       
        contato.telefone = new String[4];
        contato.telefone[0] = "73 999335647";
        contato.telefone[1] = "73 981234352";
    }
    
}
