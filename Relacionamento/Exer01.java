
package Relacionamento;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        
        System.out.println("informe o nome da agenda");
        String nome = scanner.nextLine();
        
        agenda.setNome(nome);
       
        Contato[] contatos = new Contato[3];
       
        for(int i = 0; i < contatos.length; i++){
            
            Contato c = new Contato();
            
            System.out.println("informe o nome do contato " + (i + 1) + ": ");
            String name = scanner.nextLine();
            c.setNome(name);
            
            System.out.println("informe o numero do contato " + (i + 1) + ": ");
            String number = scanner.nextLine();
            c.setTelefone(number);
            
            System.out.println("informe o email do contato " + (i + 1) + ": ");
            String email = scanner.nextLine();
            c.setEmail(email);   
            
            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        
        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
    
}
