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
public class Exer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("esceva a qtd de kg do morango: ");
        double qtdMorango = scanner.nextDouble();
        System.out.println("digite a qtd kg da maçã");
        double qtdMaca = scanner.nextDouble();
        
        double precoKgMorango = 0;
        if(qtdMorango <= 5){
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }
        
        double precoKgMaca = 0;
        if(qtdMaca <= 5){
            precoKgMaca = 1.8;
        }else{
            precoKgMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
         
        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;
        
        if((qtdMorango  + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        System.out.println("valor a ser pago: " + precoTotal);
    } 
}
