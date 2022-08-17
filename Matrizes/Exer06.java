/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer06 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        boolean ganhou = false;
        char[][] jogoVelha = new char[3][3];
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        System.out.println("jogador 1 = X");
        System.out.println("jogador 2 = 0  ");

        while (!ganhou) {
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("\nvez do jogador 1. Escolha linha e coluna (1 - 3");
                sinal = 'x';
            } else {
                System.out.println("\nvez do jogador 2. Escolha linha e coluna (1 - 3");
                sinal = 'o';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("\nentre com a linha (1, 2 ou 3)");
                linha = scanner.nextInt();

                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("\nentrada inválida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("\nentre com a coluna (1, 2 ou 3)");
                coluna = scanner.nextInt();

                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("\nentrada inválida, tente novamente ");
                }
            }

            linha--;
            coluna--;

            if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
                System.out.println("\nposição invalida");
            } else { //jogada valida
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            //imprimir tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }

                System.out.println();
            }

            //verificar ganhador
            if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x')
                    || (jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x')
                    || (jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x')
                    || (jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x')
                    || (jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x')
                    || (jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x')
                    || (jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x')
                    || (jogoVelha[0][2] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][0] == 'x')) {

                System.out.println("\n ------ jogador 1 vencedor ------ \n");
                ganhou = true;
                
            } else if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'o')
                    || (jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'o')
                    || (jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o')
                    || (jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o')
                    || (jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o')
                    || (jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'o')
                    || (jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o')
                    || (jogoVelha[0][2] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][0] == 'o')) {

                System.out.println("\n ------ jogador 2 vencedor -------- \n");
                ganhou = true;
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("\n ------ partida sem vencedor -------- \n");
            }
        }
    }

}
