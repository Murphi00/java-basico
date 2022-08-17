/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.labs;

/**
 *
 * @author alan
 */
public class Agenda {

    private Contato[] contatos;
    
    public Agenda(){
        contatos = new Contato[2];
    }
    public int consultarContato(String nome) throws ContatoInexistenteException {
        int cont = 0;
        for (Contato c : contatos) {
            if (c != null) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    return cont;
                }
            }
            cont++;
        }
        //exception
        throw new ContatoInexistenteException(nome);
 
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                this.contatos[i] = contato;
                cheia = false;
                break;
            }
        }

        if (cheia) {
            //lançar exception
            throw new AgendaCheiaException();
        }
    }

    public Contato[] getContatos() {
        return contatos;
    }
    
    
    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            s += c.toString() + "\n";
        }

        return s;
    }

}
