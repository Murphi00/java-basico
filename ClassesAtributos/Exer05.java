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
public class Exer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.agencia = "bradesco";
        cCorrente.especial = true;
        cCorrente.limite = 5.000;
        cCorrente.numero = "4447 6757 8964";
        cCorrente.saldo = 5.00;
        
        System.out.println("saldo da conta " + cCorrente.numero + "é de: " + cCorrente.saldo);
    }
    
}
