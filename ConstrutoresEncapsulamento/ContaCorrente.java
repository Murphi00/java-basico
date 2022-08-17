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
public class ContaCorrente {
    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double limiteEspecialUsado;
    
    boolean realizarSaque(Double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor );
            return true;
        } else{ // não tem saldo na conta
            if(this.isEspecial()){
                 double limite = this.getLimiteEspecial() + this.getSaldo();
                 if(limite >= valor){
                    this.setSaldo(this.getSaldo() - valor);
                    return true;
                 } else{
                     return false;
                 }
                 
            } else{ // não é especial e não tem saldo suficiente
                return false;
            }
        }
    }
    
    public void depositar(double valorDepositado){
        this.setSaldo(valorDepositado);
    }
    
    public String cosultarSaldo(){
        return "saldo: " + this.getSaldo();
    }
    
    public boolean verificarChequeEspecial(){
        return this.getSaldo() < 0;
    }
    
    public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limiteEspecial, double limiteEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.limiteEspecialUsado = limiteEspecialUsado;
    }
    
    public ContaCorrente(){
        
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecialUsado() {
        return limiteEspecialUsado;
    }

    public void setLimiteEspecialUsado(double limiteEspecialUsado) {
        this.limiteEspecialUsado = limiteEspecialUsado;
    }
    
    
}
