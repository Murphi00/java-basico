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
public class Exer01 {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);
        boolean notaValida = false;

        do {
            System.out.println("digite uma nota entre 0 e 10: ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("valor inválido, digite novamente");
            } else {
                System.out.println("nota válida");
                notaValida = true;
            }
        } while (!notaValida);
    }
}
