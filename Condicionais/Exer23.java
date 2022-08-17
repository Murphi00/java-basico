/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionais;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer23 {
    public static void main(String [] agrs){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de carne: 1 = Alcatra, 2 = Filé Duplo e 3 = Picanha: ");
        int tipo = scanner.nextInt();
        System.out.println("Informe a quantidade: ");
        double qtd = scanner.nextDouble();
        
        double preco = 0;
        if(tipo == 1){
            System.out.println("Alcatra Kg: " + qtd);
            if(qtd <= 5){
                preco = 5.90;
            } else{
                preco = 6.8;
            }
        } else if(tipo == 2){
            System.out.println("Filé Duplo Kg: " + qtd);
            if(qtd <= 5){
                preco = 4.90;
            } else{
                preco = 5.8;
            } 
        } else if(tipo == 3){
            System.out.println("Picanha Kg: " + qtd);
            if(qtd <= 5){
                preco = 6.90;
            } else{
                preco = 7.80;
            }
        } else{
            System.out.println("inválido");
        }
        
        double precoTotal = qtd * preco;
        
        System.out.println("preco total: " + precoTotal);
        System.out.println("informe a forma de pagamento: 1 - dinheiro ou 2 - Cartão" );
        double pagamento = scanner.nextInt();
        
        if(pagamento == 2){
            double desconto = (precoTotal / 100) * 5;
            precoTotal = precoTotal - desconto;
            System.out.println("forma de pagamento: cartão " );
            System.out.println("total a pagar: " + precoTotal);
            System.out.println("valor desconto: " + desconto);
        } else{
            System.out.println("forma de pagamento: dinheiro " );
            System.out.println("total a pagar: " + precoTotal);
        }    
    }
}
