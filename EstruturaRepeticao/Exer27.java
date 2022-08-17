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
public class Exer27 {

    /**
     * @param alan the command line arguments
     */
    public static void main(String[] alan) {

        Scanner scanner = new Scanner(System.in);

        double temperatura, soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Integer.MIN_VALUE;
        boolean stop = false;
        int cont = 1;
        String continuarLeitura;

        while (!stop) {

            System.out.println("informe a temperatura " + cont);
            temperatura = scanner.nextDouble();
            System.out.println("deseja continuar (S/N): ");
            continuarLeitura = scanner.next();

            soma += temperatura;
            cont++;

            if (temperatura > maior) {
                maior = temperatura;
            } else if (temperatura < menor) {
                menor = temperatura;
            }

            if (continuarLeitura.equalsIgnoreCase("n")) {
                stop = true;
            }
        }

        System.out.println("maior temperatura: " + maior);
        System.out.println("menor temperatura: " + menor);
        System.out.println("media das temperaturas: " + (soma / cont));
    }
}
