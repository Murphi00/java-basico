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
public class Lampada {
    private boolean ligada;
    private String pais;
    private String marca;
    private String tipo;
    private int tensao;
    private int potencia;
    private String cor;
    private int garantia;
    
    public Lampada(){
        
    }

    public Lampada(boolean ligada, String pais, String marca, String tipo, int tensao, int potencia, String cor, int garantia) {
        this.ligada = ligada;
        this.pais = pais;
        this.marca = marca;
        this.tipo = tipo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.garantia = garantia;
    }
    
    public Lampada(boolean ligada){
        this.ligada = ligada;
    }

    public void ligar(){
        this.setLigada(true);
    }
    
    public void desligar(){
        this.setLigada(false);
    }
    
    public String mostrarEstado(){
        if(this.isLigada()){
            return "lampada ligada";
        } 
        return "lampada desligada";
    }

    public void mudarEstado(){
        if(this.isLigada()){
           desligar();
        } else{
            ligar();
        }
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public boolean isLigada(){
        return this.ligada;
    }
}
