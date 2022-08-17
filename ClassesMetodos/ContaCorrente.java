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
public class ContaCorrente {
    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double limiteEspecialUsado;
    
    boolean realizarSaque(Double valor){
        if(saldo >= valor){
            saldo-= valor;
            return true;
        } else{ // não tem saldo na conta
            if(especial){
                 double limite = limiteEspecial + saldo;
                 if(limite >= valor){
                    saldo-= valor;
                    return true;
                 } else{
                     return false;
                 }
                 
            } else{ // não é especial e não tem saldo suficiente
                return false;
            }
        }
    }
    
    void depositar(Double valorDepositado){
        saldo+= valorDepositado;
    }
    
    void cosultarSaldo(){
        System.out.println("saldo: " + saldo);
    }
    
    boolean verificarChequeEspecial(){
        return saldo < 0;
    }
}
