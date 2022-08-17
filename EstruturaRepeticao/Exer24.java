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
public class Exer24 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        double preco;

        System.out.println("informe o preço do pão: ");
        preco = scanner.nextDouble();

        System.out.println("\nPanificadora Pão de Ontem - Tabela de Preços\n");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (i * preco));
        }
    }

}
