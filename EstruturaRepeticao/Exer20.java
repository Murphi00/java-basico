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
public class Exer20 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int qtdIdades, idade, soma = 0, media = 0;

        System.out.println("informe a quantidade de idades: ");
        qtdIdades = scanner.nextInt();

        for (int i = 0; i < qtdIdades; i++) {
            System.out.println("informe a idade " + (i + 1) + ": ");
            idade = scanner.nextInt();

            soma += idade;
        }

        media = soma / qtdIdades;

        if (media >= 0 && media <= 25) {
            System.out.println("turma jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("turma adulta");
        } else {
            System.out.println("turma idosa");
        }
    }

}
