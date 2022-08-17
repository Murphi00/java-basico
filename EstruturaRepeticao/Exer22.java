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
public class Exer22 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);
        int qtdCd;
        double valorCd, soma = 0;

        System.out.println("informe a quantidade de CDs: ");
        qtdCd = scanner.nextInt();

        for (int i = 0; i < qtdCd; i++) {
            System.out.println("informe o valor do cd " + (i + 1 + ": "));
            valorCd = scanner.nextDouble();

            soma += valorCd;
        }

        System.out.println("valor total investido: " + soma);
        System.out.println("valor medio por cd: " + (soma / qtdCd));
    }

}
