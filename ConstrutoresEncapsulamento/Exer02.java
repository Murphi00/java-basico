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
public class Exer02 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {
        
         ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.setAgencia("bradesco");
        cCorrente.setEspecial(true);
        cCorrente.setNumero("4447 6757 8964");
        cCorrente.setSaldo(100.00);
        cCorrente.setLimiteEspecial(1.00);
        
        boolean realizarSaque = cCorrente.realizarSaque(10.0);
       
        if(realizarSaque){
            System.out.println("saque realizado com sucesso");
            System.out.println("saldo: " + cCorrente.getSaldo());
        } else{
            System.out.println("saque negado");
        }
    }
    
}
