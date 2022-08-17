package ConstrutoresEncapsulamento;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer04 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        JogoVelha jogo = new JogoVelha();
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        System.out.println("jogador 1 = X  ");
        System.out.println("jogador 2 = 0  ");

        while (!ganhou) {

            if (jogo.vezJogador1()) {
                System.out.println("\nvez do jogador 1. Escolha linha e coluna (1 - 3");
                sinal = 'x';
            } else {
                System.out.println("\nvez do jogador 2. Escolha linha e coluna (1 - 3");
                sinal = 'o';
            }

            linha = valor("Linha", scanner);
            coluna = valor("Coluna", scanner);

            if (!jogo.validarJogada(linha, coluna, sinal)) {
                System.out.println("\nPosição ocupada. Tente novamente");
            }

            jogo.imprimirTabuleiro();

            if (jogo.verificarGanhador('x')) {
                System.out.println("---- Jogador 1 vencedor -----");
                ganhou = true;
            } else if (jogo.verificarGanhador('o')) {
                System.out.println("---- Jogador 2 vencedor -----");
                ganhou = true;
            } else if (jogo.getJogada() > 9) {
                System.out.println("partida sem vencedor");
                ganhou = true;
            }
        }
    }

    static int valor(String tipoValor, Scanner scanner) {
        int valor = 0;
        boolean valorValida = false;

        while (!valorValida) {
            System.out.println("\nentre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scanner.nextInt();

            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("\nentrada inválida, tente novamente");
            }
        }

        valor--;
        return valor;
    }
}
