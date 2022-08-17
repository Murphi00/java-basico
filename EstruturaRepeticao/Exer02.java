/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer02 {
    public static void main(String[] agrs){
       
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        
        do{
            System.out.println("digite o nome: ");
            String nome = scanner.next();
            System.out.println("informe a senha: ");
            String senha = scanner.next();
            
            if(nome.equalsIgnoreCase(senha)){
                System.out.println("erro... digite novamente");
            }
            else{
                System.out.println("suceful");
                valido = true;
            }
        } while(!valido);
    }
}
