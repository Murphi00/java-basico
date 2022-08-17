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
public class Exer30 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        int inicial, numFinal, tabuada;
        boolean valido = false;

        do {
            System.out.print("montar a tabuada de: ");
            tabuada = scanner.nextInt();

            System.out.print("\ncomeçar por: ");
            inicial = scanner.nextInt();

            System.out.print("\nterminar em: ");
            numFinal = scanner.nextInt();

            if (inicial > numFinal) {
                System.out.println("valores invalidos, ndigite novamente");
            } else {
                valido = true;
            }

        } while (!valido);

        System.out.println("montando a tabuada de " + tabuada + " começando em " + inicial + " e terminando em " + numFinal);
        for (int i = inicial; i <= numFinal; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }

}
