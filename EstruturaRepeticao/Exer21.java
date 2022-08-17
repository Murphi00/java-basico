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
public class Exer21 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int qtdTurmas, qtdAlunos = 0;
        double soma = 0;
        boolean invalido = true;

        System.out.println("informe a quantidade de turmas: ");
        qtdTurmas = scanner.nextInt();

        for (int i = 0; i < qtdTurmas; i++) {
            do {
                System.out.println("informe a quantidade de alunos da turma: " + (i + 1));
                qtdAlunos = scanner.nextInt();

                if (qtdAlunos <= 40) {
                    invalido = false;
                    soma += qtdAlunos;
                }

            } while (invalido != false);
        }

        System.out.println("media de alunos: " + (soma / qtdAlunos));
    }
}
