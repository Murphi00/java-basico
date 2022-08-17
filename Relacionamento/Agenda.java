/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacionamento;

/**
 *
 * @author lisle
 */
public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contato) {
        this.contatos = contato;
    }
    
    public String obterInfo(){
        String info = "Nome: " + nome + "\n";
        
        if(contatos != null){
            for(Contato c : contatos){
               info+= c.obterInformacoes() + "\n";
            }
        }
        
        return info;
    }
}
