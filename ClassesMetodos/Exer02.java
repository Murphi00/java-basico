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
public class Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.agencia = "bradesco";
        cCorrente.especial = true;
        cCorrente.numero = "4447 6757 8964";
        cCorrente.saldo = 5.00;
        cCorrente.limiteEspecial = 1.00;
        
        boolean realizarSaque = cCorrente.realizarSaque(10.0);
       
        if(realizarSaque){
            System.out.println("saque realizado com sucesso");
            System.out.println("saldo: " + cCorrente.saldo);
        } else{
            System.out.println("saque negado");
        }
    }
    
}
